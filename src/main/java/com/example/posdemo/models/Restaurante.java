package com.example.posdemo.models;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

public class Restaurante {
    private String mesa;
    private int personas;
    private LocalDate fecha;
    private LocalTime horaEntrada;
    private LocalDate horaSalida;

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDate getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDate horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Restaurante(String mesa, int personas, LocalDate fecha, LocalTime horaEntrada, LocalDate horaSalida) {
        this.mesa = mesa;
        this.personas = personas;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

}
