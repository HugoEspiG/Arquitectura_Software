/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.websocketi.repository;

import com.example.websocketi.model.Amigo;
import com.example.websocketi.repository.crudRepository.AmigoCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Asus
 */
@Repository
public class AmigoRepository {
    @Autowired
    private AmigoCrudRepository amigoCrudRepository;
    public List<Amigo> getAll(){
        return (List<Amigo>) amigoCrudRepository.findAll();
    }
    public Optional<Amigo> getAmigo(int id){
        return amigoCrudRepository.findById(id);
    }

    public Amigo save(Amigo amigo){
        return amigoCrudRepository.save(amigo);
    }
    public void delete(Amigo amigo){
        amigoCrudRepository.delete(amigo);
    }
    
}
