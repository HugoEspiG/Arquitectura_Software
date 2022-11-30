package com.example.websocketi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "client")
public class User implements Serializable {

    @Id
    private Integer idUser;

    private String name;
    private String password;

    @OneToMany
    private List<Mona> monas;
    
    @OneToMany
    private List<User> amigos;

    public Integer getIdClient() {
        return idUser;
    }

    public void setIdClient(Integer idClient) {
        this.idUser = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Mona> getMonas() {
        return monas;
    }

    public void setMonas(List<Mona> monas) {
        this.monas = monas;
    }
    
    public List<User> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<User> amigos) {
        this.amigos = amigos;
    }
    
}