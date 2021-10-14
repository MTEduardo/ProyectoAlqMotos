package com.proyectociclo3.reto3.dao;

import com.proyectociclo3.reto3.entity.Client;
import com.proyectociclo3.reto3.entity.ClientCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrud clientCrudRepository;

    public List<Client> getAll() {
        return (List<Client>) clientCrudRepository.findAll();
    }

  public Optional<Client> getClient(int id) {
        return clientCrudRepository.findById(id);
    }

  public Client save(Client client) {
        return clientCrudRepository.save(client);
    }

}
