package com.example.websocketi.repository;


import com.example.websocketi.model.User;
import com.example.websocketi.repository.crudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;
    public List<User> getAll(){
        return (List<User>) clientCrudRepository.findAll();
    }
    public Optional<User> getClient(int id){
        return clientCrudRepository.findById(id);
    }

    public User save(User client){
        return clientCrudRepository.save(client);
    }
    public void delete(User client){
        clientCrudRepository.delete(client);
    }
}
