package javalogin;
//import com.mysql.jdbc.Connection;
import java.sql.*;

public class Conexion {
   private Connection conexion;
   
   public Conexion obtener(){

      String user="root";
      String password="";
      try {
            //setConexion(DriverManager.getConnection(user, password));
            
            if(getConexion() != null){
                System.out.println("Conexion Exitosa!");
            }else{
                System.out.println("Conexion Fallida!");                
            }
            
      } catch (Exception e) {
              e.printStackTrace();
  }
   
      return this;
   }
   public Connection getConexion() {
  return conexion;
   }    
   public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }   
   
   public ResultSet consultar(String sql) {
        ResultSet resultado;
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }        return resultado;
    }
}