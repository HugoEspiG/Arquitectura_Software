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
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserService clientService;

    @GetMapping("/all")
    public List<User> getClients() {
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin
    public Optional<User> getClient(@PathVariable("id") String clientId) {
        return clientService.getClient(clientId);
    }

    @PostMapping(name = "/save", consumes = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public User save(@RequestBody User client) {
        User c = new User();
        c.setIdClient(client.getIdClient());
        c.setName(client.getName());
        c.setLastName(client.getLastName());
        c.setMail(client.getMail());
        c.setPassword(client.getPassword());

        System.out.println(c);
        return clientService.save(c);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User client) {
        return clientService.update(client);
    }
    
    @PostMapping(value = "/login", consumes = {"application/json"})
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @ResponseStatus(HttpStatus.CREATED)
    public Optional<User> login(@RequestBody User user) {
        String mail = user.getMail();
        String password = user.getPassword();
        
        /*System.out.println(mail);
        if(mail.equals("pablo@email.com")){
            System.out.println("son iguales");
        }else{
            System.out.println("no lo son");
        }*/
        return clientService.getUser(mail, password);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") String clientId) {
        return clientService.deleteClient(clientId);
    }

}
