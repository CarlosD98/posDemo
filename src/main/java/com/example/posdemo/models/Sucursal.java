package com.example.posdemo.models;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Sucursal {
    private String nombre;
    private String domicilio;
    private int codigoPostal;
    
}
