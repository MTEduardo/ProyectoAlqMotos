package com.proyectociclo3.reto3.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCrud extends CrudRepository<Client, Integer> {
    
}
