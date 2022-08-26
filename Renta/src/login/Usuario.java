package javalogin;
/**
 *
 */
public class Usuario {
    private int IDUsuario;
    private String Usuario;
    private String Nombre;
    private String Identificacion;
    private String tipo_user;
    
    private static Usuario instance;
   
    
    public Usuario(int idusuario, String usuario, String nombre, String identificacion, String tipo_user ){
        this.IDUsuario = idusuario;
        this.Usuario = usuario;
        this.Nombre = nombre;
        this.Identificacion = identificacion;
        this.tipo_user = tipo_user;
    }
    
    private Usuario(){
        
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
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
    public String getIdTipoUsuario() {
        return tipo_user;
    }
    public void setIdTipoUsuario(String IdTipoUsuario) {
        this.tipo_user = IdTipoUsuario;
    }
    public static Usuario getInstance() {
        if (instance == null)
            instance = new Usuario();
        return instance;
    }
}