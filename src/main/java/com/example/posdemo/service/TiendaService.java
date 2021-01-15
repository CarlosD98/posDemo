package com.example.posdemo.service;

import java.math.BigDecimal;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.posdemo.models.Pago;
import com.example.posdemo.models.Producto;
import com.example.posdemo.models.Venta;
import com.example.posdemo.repositories.ProductosRepository;
import com.example.posdemo.repositories.VentasRepository;
import com.example.posdemo.requests.VentaCreationReq;

import org.joda.time.LocalDate;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TiendaService {
    private final ProductosRepository productosRepository;
    private final VentasRepository ventasRepository;


    public Venta getVenta(int id){
        Optional<Venta> venta = ventasRepository.findById(id);
        
        if (venta.isPresent())
        {return venta.get();}
        throw new EntityNotFoundException("No se encontro la venta con esa Id");
    }

    public Producto getProducto(int id){
        Optional<Producto> producto = productosRepository.findById(id);
        if (producto.isPresent())
        {return producto.get();}
        throw new EntityNotFoundException("No se encontro el producto con esa Id");
    }

    public Venta addVenta(VentaCreationReq req){
        Venta venta = new Venta();
        BeanUtils.copyProperties(req, venta);
        venta.setFecha(new LocalDate());
        BigDecimal total = new BigDecimal(0);
        BigDecimal cantidadTotal = new BigDecimal(0);
        for (Producto i : venta.getProductos()) {
            total.add(i.getPrecio().multiply(i.getCantidad()));
            cantidadTotal.add(i.getCantidad());
        }
        venta.setTotal(total);
        venta.setCantidadToatal(cantidadTotal.intValue());
        BigDecimal iva16 = total.multiply(new BigDecimal(.16));
        venta.setTotalIva16(iva16);
        venta.setTotalNeto(total.add(iva16));
        BigDecimal totalPagado = new BigDecimal(0);
        for (Pago i : venta.getPagos()) {
            totalPagado.add(i.getPagado());            
        }
        venta.setTotalPagado(totalPagado);

        return ventasRepository.save(venta);
        
    }

    
}
