package com.proyectociclo3.reto3.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationCrud extends CrudRepository<Reservation, Integer> {
    
}
