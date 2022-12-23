package com.example.websocketi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="mona")
public class Mona implements Serializable {

    @Id
    private Integer idMona;

    private String name;
    private String team;
    private String uimage;

    public Integer getIdMessage() {
        return idMona;
    }

    public void setIdMessage(Integer idMona) {
        this.idMona = idMona;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
    public String getImage() {
        return uimage;
    }

    public void setImage(String uimage) {
        this.uimage = uimage;
    }
}
