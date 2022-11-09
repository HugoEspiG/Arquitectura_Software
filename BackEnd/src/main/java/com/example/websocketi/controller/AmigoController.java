/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.websocketi.controller;

import com.example.websocketi.model.Amigo;
import com.example.websocketi.service.AmigoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Asus
 */
@RestController
@RequestMapping("/api/Amigo")
public class AmigoController {
    
    @Autowired
    private AmigoService amigoService;
    @GetMapping("/all")
    public List<Amigo> getAmigos(){
        return amigoService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Amigo> getAmigo(@PathVariable("id") int amigoId) {
        return amigoService.getClient(amigoId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Amigo save(@RequestBody Amigo amigo) {
        return amigoService.save(amigo);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Amigo update(@RequestBody Amigo amigo) {
        return amigoService.update(amigo);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int amigoId) {
        return amigoService.deleteClient(amigoId);
    }
    
}
