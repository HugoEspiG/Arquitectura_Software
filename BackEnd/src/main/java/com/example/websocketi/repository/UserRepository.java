package com.example.websocketi.repository;


import com.example.websocketi.model.User;
import com.example.websocketi.repository.crudRepository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository userCrudRepository;
    public List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
    }
    public Optional<User> getClient(String id){
        return userCrudRepository.findById(id);
    }
    
    public Optional<User> getUser(String mail, String password){
        return userCrudRepository.findByMail(mail, password);
    }
    
    public User save(User user){
        return userCrudRepository.save(user);
    }
    public void delete(User user){
        userCrudRepository.delete(user);
    }
}
