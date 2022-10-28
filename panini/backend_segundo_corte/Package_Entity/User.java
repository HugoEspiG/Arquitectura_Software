/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Asus
 */
@Entity
@Table(name="user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable=false)
    private Integer id_user;
    
    private String name;
    private String email;
    private String password;
    private String imagen;
  
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "user")
    @JsonIgnoreProperties("user")
    private List<Mona> monas;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "user")
    @JsonIgnoreProperties("user")
    private List<Amigos> amigos;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Mona> getMonas() {
        return monas;
    }

    public void setMonas(List<Mona> monas) {
        this.monas = monas;
    }  
}
