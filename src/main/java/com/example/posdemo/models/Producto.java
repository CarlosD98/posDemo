package com.example.posdemo.models;

public class Producto {
    private int productoId;
    private String sku;
    private String nombre, nombreCompleto;
    private int cantidad;
    private double precio;
    private double iva8;
    private double iva16;
    private double ieps;
    private double descuentoPorcentaje;
    private double descuentoTotal;
    private double total;
    private double totalNeto;
    private String cancelacionConfirmacion;

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva8() {
        return iva8;
    }

    public void setIva8(double iva8) {
        this.iva8 = iva8;
    }

    public double getIva16() {
        return iva16;
    }

    public void setIva16(double iva16) {
        this.iva16 = iva16;
    }

    public double getIeps() {
        return ieps;
    }

    public void setIeps(double ieps) {
        this.ieps = ieps;
    }

    public double getDescuentoPorcentaje() {
        return descuentoPorcentaje;
    }

    public void setDescuentoPorcentaje(double descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    public double getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal(double descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(double totalNeto) {
        this.totalNeto = totalNeto;
    }

    public String getCancelacionConfirmacion() {
        return cancelacionConfirmacion;
    }

    public void setCancelacionConfirmacion(String cancelacionConfirmacion) {
        this.cancelacionConfirmacion = cancelacionConfirmacion;
    }

    public Producto(int productoId, String sku, String nombre, String nombreCompleto, int cantidad, double precio,
            double iva8, double iva16, double ieps, double descuentoPorcentaje, double descuentoTotal, double total,
            double totalNeto, String cancelacionConfirmacion) {
        this.productoId = productoId;
        this.sku = sku;
        this.nombre = nombre;
        this.nombreCompleto = nombreCompleto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva8 = iva8;
        this.iva16 = iva16;
        this.ieps = ieps;
        this.descuentoPorcentaje = descuentoPorcentaje;
        this.descuentoTotal = descuentoTotal;
        this.total = total;
        this.totalNeto = totalNeto;
        this.cancelacionConfirmacion = cancelacionConfirmacion;
    }

}
