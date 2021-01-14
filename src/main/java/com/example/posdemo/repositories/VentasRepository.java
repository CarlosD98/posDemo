package com.example.posdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.posdemo.models.Venta;

public interface VentasRepository extends JpaRepository<Venta, Integer> {

}
