package com.example.posdemo.repositories;



import com.example.posdemo.models.Pago;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PagosRepository extends JpaRepository<Pago,Integer>{
   
    
}
