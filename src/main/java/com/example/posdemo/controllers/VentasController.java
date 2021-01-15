package com.example.posdemo.controllers;


import com.example.posdemo.models.Venta;
import com.example.posdemo.requests.VentaCreationReq;
import com.example.posdemo.service.TiendaService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/venta")
@RequiredArgsConstructor
public class VentasController {
    private final TiendaService service;


    @PostMapping(consumes = "application/json")
    public ResponseEntity<Venta> crearVenta(@RequestBody VentaCreationReq venta){
        return ResponseEntity.ok(service.addVenta(venta));
    } 

    @GetMapping("/{id}")
    public ResponseEntity<Venta> getVenta(@PathVariable int id) {
        return ResponseEntity.ok(service.getVenta(id));
        
    }

    
}
