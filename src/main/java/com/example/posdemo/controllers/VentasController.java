package com.example.posdemo.controllers;

import com.example.posdemo.models.Venta;
import com.example.posdemo.repositories.Mysqlrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ventas")
public class VentasController {
    @Autowired
    private Mysqlrepository mysqlrepository;

    @GetMapping
    public Iterable<Venta> getVentas() {
        return mysqlrepository.findAll();
        
    }

    
}
