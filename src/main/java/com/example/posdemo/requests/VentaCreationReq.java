package com.example.posdemo.requests;

import java.util.List;

import com.example.posdemo.models.Pago;
import com.example.posdemo.models.Producto;
import com.example.posdemo.models.Sucursal;

import lombok.Data;

@Data
public class VentaCreationReq {
    private int caja;
    private List<Producto> productos;
    private List<Pago> pagos;
    private Sucursal sucursal;
    
}
