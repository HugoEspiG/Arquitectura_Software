package com.example.websocketi.service;


import com.example.websocketi.model.User;
import com.example.websocketi.repository.UserRepository;
import com.example.websocketi.socket.Socket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository clientRepository;


    public List<User> getAll(){
        return clientRepository.getAll();
    }
    
    public boolean login(String email, String password){
        System.out.println("mail: "+email);

        //System.out.println(clientRepository.getClient(153));
        //if(user.getPassword()==clientRepository.getClient(user.getIdClient()))
        
        return true;
    } 

    public Optional<User> getClient(String clientId) {
        return clientRepository.getClient(clientId);
    }

    public User save(User client){
        if(client.getIdClient()==null){
            return clientRepository.save(client);
        }else{
            Optional<User> e= clientRepository.getClient(client.getIdClient());
            if(!e.isPresent()){
                return clientRepository.save(client);
            }else{
                return client;
            }
        }
    }

    public User update(User client){
        if(client.getIdClient()!=null){
            Optional<User> e= clientRepository.getClient(client.getIdClient());
            if(e.isPresent()){
                if(client.getName()!=null) {
                    e.get().setName(client.getName());
                }
                clientRepository.save(e.get());
                return e.get();
            }else{
                return client;
            }
        }else{
            return client;
        }
    }

    public boolean deleteClient(String clientId) {
        Boolean aBoolean = getClient(clientId).map(client -> {
            clientRepository.delete(client);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
