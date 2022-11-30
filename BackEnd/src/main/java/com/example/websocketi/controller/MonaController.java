    package com.example.websocketi.controller;


import com.example.websocketi.model.User;
import com.example.websocketi.model.Mona;
import com.example.websocketi.service.MonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Mona")
public class MonaController {

    @Autowired
    private MonaService monaService;
    @GetMapping("/all")
    public List<Mona> getClients(){
        return monaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Mona> getClient(@PathVariable("id") int messageId) {
        return monaService.getMona(messageId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mona save(@RequestBody Mona message) {
        return monaService.save(message);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Mona update(@RequestBody Mona message) {
        return monaService.update(message);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int clientId) {
        return monaService.deleteClient(clientId);
    }

}
