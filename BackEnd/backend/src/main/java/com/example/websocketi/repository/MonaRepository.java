package com.example.websocketi.repository;


import com.example.websocketi.model.User;
import com.example.websocketi.model.Mona;
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
    public Optional<Mona> getMona(int id){
        return monaCrudRepository.findById(id);
    }
    public List<Mona> getMonas(String team){
        return monaCrudRepository.findByTeam(team);
    }
    
    public Mona save(Mona mona){
        return monaCrudRepository.save(mona);
    }
    public void delete(Mona mona){
        monaCrudRepository.delete(mona);
    }
}
