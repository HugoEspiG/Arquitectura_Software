package com.example.websocketi.repository;


import com.example.websocketi.model.User;
import com.example.websocketi.model.Mona;
import com.example.websocketi.repository.crudRepository.ClientCrudRepository;
import com.example.websocketi.repository.crudRepository.MonaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MonaRepository {
    @Autowired
    private MonaCrudRepository monaCrudRepository;
    public List<Mona> getAll(){
        return (List<Mona>) monaCrudRepository.findAll();
    }
    public Optional<Mona> getMessage(int id){
        return monaCrudRepository.findById(id);
    }

    public Mona save(Mona mona){
        return monaCrudRepository.save(mona);
    }
    public void delete(Mona mona){
        monaCrudRepository.delete(mona);
    }
}
