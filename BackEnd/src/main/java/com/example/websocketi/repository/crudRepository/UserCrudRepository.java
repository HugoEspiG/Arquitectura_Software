package com.example.websocketi.repository.crudRepository;

import com.example.websocketi.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserCrudRepository extends CrudRepository<User, String> {

    @Query(value = "SELECT * FROM client AS m WHERE m.mail =:mail AND m.password =:password", nativeQuery = true)
    Optional <User> findByMail(String mail, String password);
}
