package com.example.posdemo.models;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Pago {
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

 public enum Tipo{ DEBITO, CREDITO, VALES, DIVISAS, EFECTIVO}

}
