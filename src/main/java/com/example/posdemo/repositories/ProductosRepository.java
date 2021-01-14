package com.example.posdemo.repositories;



import com.example.posdemo.models.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Producto, Integer> {
   
    
}
