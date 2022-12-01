package com.example.websocketi.controller;

import com.example.websocketi.model.Mona;
import com.example.websocketi.service.MonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.query.Param;

@RestController
@RequestMapping("/api/Mona")
public class MonaController {

    @Autowired
    private MonaService monaService;
    @GetMapping("/all")
    public List<Mona> getAll(){
        return monaService.getAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin
    public Optional<Mona> getMona(@PathVariable("id") int messageId) {
        return monaService.getMona(messageId);
    }

    
    @GetMapping("equipo/{team}")
    @CrossOrigin
    public List<Mona> getMonas(@PathVariable("team") String team) {
        System.out.println("team: "+team);
        //team = "FRANCIA";
        return monaService.getMonas(team);
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
