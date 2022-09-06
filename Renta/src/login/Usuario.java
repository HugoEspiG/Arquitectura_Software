/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author Luffy
 */
public class Usuario {
    private String IDUsuario;
    private String Usuario;
    private String Nombre;
    private String Identificacion;
    private boolean tipo_user;
    private String pssw;
    
    private static Usuario instance;

    public Usuario(String IDUsuario, String Usuario, String Nombre, String Identificacion, String pssw,boolean tipo_user) {
        this.IDUsuario = IDUsuario;
        this.Usuario = Usuario;
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
        this.tipo_user = tipo_user;
        this.pssw = pssw;
    }
       
    private Usuario(){
        
    }

    public String getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(String IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getNombreApellidos() {
        return Nombre;
    }
    public void setNombreApellidos(String NombreApellidos) {
        this.Nombre = NombreApellidos;
    }
    public String getIdentificacion() {
        return Identificacion;
    }
    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }
    public boolean getIdTipoUsuario() {
        return tipo_user;
    }
    public void setIdTipoUsuario( boolean IdTipoUsuario) {
        this.tipo_user = IdTipoUsuario;
    }

    public String getPssw() {
        return pssw;
    }

    public void setPssw(String pssw) {
        this.pssw = pssw;
    }
   
    
    public static Usuario getInstance() {
        if (instance == null)
            instance = new Usuario();
        return instance;
    }
}
