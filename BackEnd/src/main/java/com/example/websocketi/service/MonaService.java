package com.example.websocketi.service;


import com.example.websocketi.model.Mona;
import com.example.websocketi.repository.MonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonaService {
    @Autowired
    private MonaRepository monaRepository;

    public List<Mona> getAll(){
        return monaRepository.getAll();
    }

    public Optional<Mona> getMessage(int idMessage) {
        return monaRepository.getMessage(idMessage);
    }

    public Mona save(Mona message){
        if(message.getIdMessage()==null){
            return monaRepository.save(message);
        }else{
            Optional<Mona> e= monaRepository.getMessage(message.getIdMessage());
            if(!e.isPresent()){
                return monaRepository.save(message);
            }else{
                return message;
            }
        }
    }

    public Mona update(Mona client){
        if(client.getIdMessage()!=null){
            Optional<Mona> e= monaRepository.getMessage(client.getIdMessage());
            if(e.isPresent()){
                monaRepository.save(e.get());
                return e.get();
            }else{
                return client;
            }
        }else{
            return client;
        }
    }

    public boolean deleteClient(int messageId) {
        Boolean aBoolean = getMessage(messageId).map(message -> {
            monaRepository.delete(message);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
