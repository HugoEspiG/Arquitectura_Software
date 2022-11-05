package com.example.websocketi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "client")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    private String name;
    private String password;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties("client")
    public List<Mona> monas;

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

    public List<Mona> getMessages() {
        return monas;
    }

    public void setMessages(List<Mona> monas) {
        this.monas = monas;
    }
}