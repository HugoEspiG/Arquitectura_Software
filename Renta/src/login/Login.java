package javalogin;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Login {
    
    
    public boolean login(String usuario, String password)throws SQLException {
     try {
         Conexion conexion = new Conexion().obtener();
         
         ResultSet resultado = conexion.consultar("SELECT idusuario, titular, identificacion, tipo_usuario FROM usuarios WHERE usuario = '" + usuario + "' and password = '" + password + "'" );
         resultado.last();
         if (resultado.getRow() > 0){
             Usuario usuarioactual = Usuario.getInstance();
             //Usuario usuarioactual = new Usuario(resultado.getInt("idusuario"),usuario,resultado.getString("titular"),resultado.getString("identificacion"),resultado.getString("tipo_usuario"));
             // System.out.println("ID: "+resultado.getString("idusuario"));
              usuarioactual.setIDUsuario(resultado.getInt("idusuario"));
              usuarioactual.setIdTipoUsuario(resultado.getString("tipo_usuario"));
              usuarioactual.setIdentificacion(resultado.getString("identificacion"));
              usuarioactual.setNombreApellidos(resultado.getString("titular"));                            
             // System.out.println(""+resultado.getString("titular"));
             return true;
        }
   } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
      return false;
   }
}