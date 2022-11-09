/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.websocketi.service;

import com.example.websocketi.model.Amigo;
import com.example.websocketi.repository.AmigoRepository;
import com.example.websocketi.socket.Socket;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class AmigoService {
    @Autowired
    private AmigoRepository amigoRepository;


    public List<Amigo> getAll(){
        return amigoRepository.getAll();
    }

    public Optional<Amigo> getClient(int amigoId) {
        return amigoRepository.getAmigo(amigoId);
    }

    public Amigo save(Amigo amigo){
        Socket.broadcast("dldkjf");
        if(amigo.getId_amigo()==null){
            return amigoRepository.save(amigo);
        }else{
            Optional<Amigo> e= amigoRepository.getAmigo(amigo.getId_amigo());
            if(!e.isPresent()){
                return amigoRepository.save(amigo);
            }else{
                return amigo;
            }
        }
    }

    public Amigo update(Amigo amigo){
        if(amigo.getId_amigo()!=null){
            Optional<Amigo> e= amigoRepository.getAmigo(amigo.getId_amigo());
            if(e.isPresent()){
                if(amigo.getName_amigo()!=null) {
                    e.get().setName_amigo(amigo.getName_amigo());
                }
                amigoRepository.save(e.get());
                return e.get();
            }else{
                return amigo;
            }
        }else{
            return amigo;
        }
    }

    public boolean deleteClient(int amigoId) {
        Boolean aBoolean = getClient(amigoId).map(amigo -> {
            amigoRepository.delete(amigo);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
