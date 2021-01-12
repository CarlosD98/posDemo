package com.example.posdemo.repositories;

import com.example.posdemo.models.Venta;

import org.springframework.data.repository.CrudRepository;

public interface Mysqlrepository extends CrudRepository<Venta, Integer> {
    
}
