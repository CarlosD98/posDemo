package com.example.posdemo.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.example.posdemo.models.Producto;
import com.example.posdemo.models.Venta;
import com.example.posdemo.repositories.PagosRepository;
import com.example.posdemo.repositories.ProductosRepository;
import com.example.posdemo.repositories.RestaurantesRepository;
import com.example.posdemo.repositories.SucursalesRepository;
import com.example.posdemo.repositories.VentasRepository;
import com.example.posdemo.requests.VentaCreationReq;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TiendaService {
    private final PagosRepository pagosRepository;
    private final ProductosRepository productosRepository;
    private final RestaurantesRepository restaurantesRepository;
    private final SucursalesRepository sucursalesRepository;
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
        return new Venta();
        
    }



    
}
