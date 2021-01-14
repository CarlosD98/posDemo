package com.example.posdemo.requests;

import java.util.List;
import java.util.Optional;


import lombok.Data;

@Data
public class VentaCreationReq {
    private List<ProductoCreationReq> productos;
    private List<PagoCreationReq> pagos;
    private Optional<SucursalCreationReq> sucursal;
    private Optional<RestauranteCreationReq> restaurante;
    
}
