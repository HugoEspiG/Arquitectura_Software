package com.example.websocketi.repository.crudRepository;

import com.example.websocketi.model.User;
import com.example.websocketi.model.Mona;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Mona,Integer> {

}