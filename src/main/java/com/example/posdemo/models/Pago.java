package com.example.posdemo.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JsonManagedReference
    private int id;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private Tipo tipo;
    @Column(name = "pagado")
    private BigDecimal pagado;
    @Column(name = "ultimos4", length = 4 )
    private int ultimos4;
    @Column(name = "autorizacion")
    private int autorizacion;
    @Enumerated(EnumType.STRING)
    @Column(name = "divisas")
    private Divisa divisa;
    @Column(name = "tipo_cambio")
    private BigDecimal tipoCambio;
    @Column(name = "entregado_divisa")
    private BigDecimal entregadoDivisa;
    @Column(name = "entregado")
    private BigDecimal entregado;
    @Column(name = "cambio")
    private BigDecimal cambio;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "venta_id")
    @JsonManagedReference
    private Venta venta;

 public enum Tipo{ DEBITO, CREDITO, VALES, DIVISAS, EFECTIVO}
 public enum Divisa{USD}

 

}
