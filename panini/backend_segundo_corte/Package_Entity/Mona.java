/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@Entity
@Table(name="mona")
public class Mona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable=false)
    private Integer id_mona;
    
    private String name_player;
    private String team;
    private String imagen;
    
    @ManyToOne
    @JoinColumn(name="id_user")
    @JsonIgnoreProperties({"monas","user"})
    private User user;

    public String getName_player() {
        return name_player;
    }

    public void setName_player(String name_player) {
        this.name_player = name_player;
    }

    public String getNombre_jugador() {
        return name_player;
    }

    public void setNombre_jugador(String nombre_jugador) {
        this.name_player = nombre_jugador;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getId_mona() {
        return id_mona;
    }

    public void setId_mona(Integer id_mona) {
        this.id_mona = id_mona;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }    
}
