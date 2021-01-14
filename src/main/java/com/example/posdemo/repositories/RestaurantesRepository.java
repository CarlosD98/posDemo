package com.example.posdemo.repositories;



import com.example.posdemo.models.Restaurante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantesRepository extends JpaRepository<Restaurante, Integer> {
    
}
