package com.example.websocketi.service;


import com.example.websocketi.model.Mona;
import com.example.websocketi.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Mona> getAll(){
        return messageRepository.getAll();
    }

    public Optional<Mona> getMessage(int idMessage) {
        return messageRepository.getMessage(idMessage);
    }

    public Mona save(Mona message){
        if(message.getIdMessage()==null){
            return messageRepository.save(message);
        }else{
            Optional<Mona> e= messageRepository.getMessage(message.getIdMessage());
            if(!e.isPresent()){
                return messageRepository.save(message);
            }else{
                return message;
            }
        }
    }

    public Mona update(Mona client){
        if(client.getIdMessage()!=null){
            Optional<Mona> e= messageRepository.getMessage(client.getIdMessage());
            if(e.isPresent()){

                messageRepository.save(e.get());
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
            messageRepository.delete(message);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
