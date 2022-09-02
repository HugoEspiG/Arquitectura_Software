package login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Login {
    
    private ArrayList<Usuario> users =new ArrayList<>();
    int posicion;
    public Login() {
    }
   
    public boolean validar (String pssw, String user){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsuario().equals(user) && users.get(i).getPssw().equals(pssw)) {
                return true;
            }
     
        }
        return false;
    }
    
    public boolean validarAdmon (String user){

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getIdTipoUsuario()=="admon") {
                return true;
            }
     
        }
        return false;
    }
        
 

