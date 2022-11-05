package com.example.websocketi.repository;


import com.example.websocketi.model.User;
import com.example.websocketi.model.Mona;
import com.example.websocketi.repository.crudRepository.ClientCrudRepository;
import com.example.websocketi.repository.crudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;
    public List<Mona> getAll(){
        return (List<Mona>) messageCrudRepository.findAll();
    }
    public Optional<Mona> getMessage(int id){
        return messageCrudRepository.findById(id);
    }

    public Mona save(Mona message){
        return messageCrudRepository.save(message);
    }
    public void delete(Mona message){
        messageCrudRepository.delete(message);
    }
}
