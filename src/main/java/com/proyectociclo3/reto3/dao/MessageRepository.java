package com.proyectociclo3.reto3.dao;

import com.proyectociclo3.reto3.entity.Message;
import com.proyectociclo3.reto3.entity.MessageCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {

    @Autowired
    private MessageCrud messageCrudRepository;

    public List<Message> getAll() {
        return (List<Message>) messageCrudRepository.findAll();
    }

  public Optional<Message> getMessage(int id) {
        return messageCrudRepository.findById(id);
    }

  public Message save(Message message) {
        return messageCrudRepository.save(message);
    }

}
