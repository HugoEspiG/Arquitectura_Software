package com.example.websocketi.controller;


import com.example.websocketi.model.User;
import com.example.websocketi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/User")

public class UserController {

    @Autowired
    private UserService clientService;
    @GetMapping("/all")
    public List<User> getClients(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin
    public Optional<User> getClient(@PathVariable("id") int clientId) {
        return clientService.getClient(clientId);
    }
    
    @PostMapping("/postbody")
    public String postBody(@RequestBody String fullName, String password) {
        return "Hello " + fullName + ", "+ password;
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User user) {
        return clientService.save(user);
    }
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean login(@RequestBody User user) {
        return clientService.login(user);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User client) {
        return clientService.update(client);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int clientId) {
        return clientService.deleteClient(clientId);
    }

}
