/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import Entity.Mona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MonaRepository;
import repository.UserRepository;

/**
 *
 * @author Asus
 */
@Service
public class MonaService {
    
    @Autowired
    private MonaRepository monaRepository;
    
    public List<Mona> getAll(){
        return monaRepository.getAll();
    }

    public Optional<Mona>getById(int id){
        return monaRepository.getById(id);
    }
    public Mona save(Mona c){
        if(c.getId_mona()==null){
            return monaRepository.save(c);
        }
        return c;
    }
    public boolean delete(int id){
        Optional<Mona> cOp=monaRepository.getById(id);
        if(cOp.isPresent()){
            monaRepository.delete(cOp.get());
            return true;
        }
        return false;
    }
    public Mona update(Mona c){
        if(c.getId_mona()!=null){
            Optional<Mona> old=monaRepository.getById(c.getId_mona());
            if(old.isPresent()){
                Mona k=old.get();
                if(c.getName_player()!=null){
                    k.setName_player(c.getName_player());
                }
                return monaRepository.save(k);
            }
        }
        return c;
    }
    
}
