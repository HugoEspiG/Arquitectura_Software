/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Luffy
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="amigos")
public class Amigos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable=false)
    private Integer id_amigo;
    
    private String name_amigo;
        
    @ManyToOne
    @JoinColumn(name="id_user")
    @JsonIgnoreProperties({"amigos","user"})
    private User user;
    
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
