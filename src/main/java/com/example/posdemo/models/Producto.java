package com.example.posdemo.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productos")
public class Producto { 
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn(name = "venta_id")
    @JsonManagedReference
    private Venta venta;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "sku")
    private String sku;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "iva8")
    private BigDecimal iva8;
    @Column(name = "iva16")
    private BigDecimal iva16;
    @Column(name = "ieps")
    private BigDecimal ieps;
    @Column(name = "descuento_porcentaje")
    private BigDecimal descuentoPorcentaje;
    @Column(name = "desceunto_total")
    private BigDecimal descuentoTotal;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "total_neto")
    private BigDecimal totalNeto;
    @Column(name = "cancelacion_confirmacion")
    private String cancelacionConfirmacion;

    
}
