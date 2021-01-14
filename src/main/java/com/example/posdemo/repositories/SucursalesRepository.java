package com.example.posdemo.repositories;



import com.example.posdemo.models.Sucursal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalesRepository extends JpaRepository<Sucursal, Integer> {
    
}
