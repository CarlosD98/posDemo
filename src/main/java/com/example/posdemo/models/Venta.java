package com.example.posdemo.models;

import java.util.ArrayList;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.posdemo.models.Pago;

import org.joda.time.LocalDate;

@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private LocalDate fecha;
    private int caja;
    private int cantitdadToatal;
    private double total;
    private double descuentoTotal;
    private double totalIva8;
    private double totalIva16;
    private double totalIeps;
    private double totalNeto;
    private double totalPagado;
    private ArrayList<Producto> productos;
    private Pago pago;
    private Sucursal sucursal;
    private Restaurante restaurante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public int getCantitdadToatal() {
        return cantitdadToatal;
    }

    public void setCantitdadToatal(int cantitdadToatal) {
        this.cantitdadToatal = cantitdadToatal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal(double descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    public double getTotalIva8() {
        return totalIva8;
    }

    public void setTotalIva8(double totalIva8) {
        this.totalIva8 = totalIva8;
    }

    public double getTotalIva16() {
        return totalIva16;
    }

    public void setTotalIva16(double totalIva16) {
        this.totalIva16 = totalIva16;
    }

    public double getTotalIeps() {
        return totalIeps;
    }

    public void setTotalIeps(double totalIeps) {
        this.totalIeps = totalIeps;
    }

    public double getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(double totalNeto) {
        this.totalNeto = totalNeto;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    


}
