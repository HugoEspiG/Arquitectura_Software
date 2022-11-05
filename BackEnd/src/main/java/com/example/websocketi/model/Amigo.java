/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.websocketi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;

/**
 *
 * @author Asus
 */
@Entity
@Table (name = "amigo")
public class Amigo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_amigo;
    
    private String name_amigo;
    
    @ManyToOne
    @JoinColumn(name="clientId")
    @JsonIgnoreProperties({"amigo"})
    public User user;

    public Integer getId_amigo() {
        return id_amigo;
    }

    public void setId_amigo(Integer id_amigo) {
        this.id_amigo = id_amigo;
    }

    public String getName_amigo() {
        return name_amigo;
    }

    public void setName_amigo(String name_amigo) {
        this.name_amigo = name_amigo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
}
