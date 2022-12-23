package com.example.websocketi.repository.crudRepository;

import com.example.websocketi.model.Mona;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MonaCrudRepository extends CrudRepository<Mona,Integer> {

    @Query("SELECT * FROM mona AS m WHERE m.team =:team")
    List <Mona> findByTeam(String team);
}