package com.example.websocketi.controller;


import com.example.websocketi.model.User;
import com.example.websocketi.model.Mona;
import com.example.websocketi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Mona")
public class MonaController {

    @Autowired
    private MessageService messageService;
    @GetMapping("/all")
    public List<Mona> getClients(){
        return messageService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Mona> getClient(@PathVariable("id") int messageId) {
        return messageService.getMessage(messageId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mona save(@RequestBody Mona message) {
        return messageService.save(message);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Mona update(@RequestBody Mona message) {
        return messageService.update(message);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int clientId) {
        return messageService.deleteClient(clientId);
    }

}
