/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import Entity.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

/**
 *
 * @author Asus
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public List<User> getAll(){
        return userRepository.getAll();
    }

    public Optional<User>getById(int id){
        return userRepository.getById(id);
    }
    public User save(User c){
        if(c.getId_user()==null){
            return userRepository.save(c);
        }
        return c;
    }
    public boolean delete(int id){
        Optional<User> cOp=userRepository.getById(id);
        if(cOp.isPresent()){
            userRepository.delete(cOp.get());
            return true;
        }
        return false;
    }
    public User update(User c){
        if(c.getId_user()!=null){
            Optional<User> old=userRepository.getById(c.getId_user());
            if(old.isPresent()){
                User k=old.get();
                if(c.getName()!=null){
                    k.setName(c.getName());
                }
                return userRepository.save(k);
            }
        }
        return c;
    }
}
