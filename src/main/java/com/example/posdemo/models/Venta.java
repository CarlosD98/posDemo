package com.example.posdemo.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import org.joda.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "caja")
    private int caja;
    @Column(name = "cantidad_total")
    private int cantidadToatal;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "descuento_total")
    private BigDecimal descuentoTotal;
    @Column(name = "total_iva8")
    private BigDecimal totalIva8;
    @Column(name = "total_iva16")
    private BigDecimal totalIva16;
    @Column(name = "total_ieps")
    private BigDecimal totalIeps;
    @Column(name = "total_neto")
    private BigDecimal totalNeto;
    @Column(name = "total_pagado")
    private BigDecimal totalPagado;
    @JsonBackReference
    @OneToMany(
        mappedBy = "venta",
        cascade = CascadeType.ALL,
        orphanRemoval = true,
        fetch = FetchType.LAZY
    )
    
    private List<Producto> productos;
    @JsonBackReference 
    @OneToMany(
        mappedBy = "venta",
        cascade = CascadeType.ALL,
        orphanRemoval = true,
        fetch = FetchType.LAZY
    )
    private List<Pago> pagos;
    @Embedded
    @AttributeOverride(name = "nombre", column = @Column(name = "sucursal_nombre"))
    private Sucursal sucursal;


}
