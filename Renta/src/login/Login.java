package login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Login {
    
    private ArrayList<Usuario> users =new ArrayList<>();
     public Login() {
        users.add(new Usuario("1","hugo_admin","Hugo Calderon","100345","admin", "hugo123"));
        users.add(new Usuario("2","juanpa12","Juan Pablo Rodriguez","11001346","cliente", "jun12"));
        users.add(new Usuario("3","camilo15","Camilo Cardenas","1004475","cliente", "1004475"));
        users.add(new Usuario("4","alejandroking","Alejaandro Villamil","52600454","cliente", "tatoabogado"));
    }
     
    public Usuario validar (String pssw, String user){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsuario().equals(user) && users.get(i).getPssw().equals(pssw)) {
                return users.get(i);
            }
     
        } System.out.println("Usuario invalido");
        return null;
    }
    
    public boolean validarAdmon (Usuario user){
        
        if (user.getIdTipoUsuario()=="admon"){
            return true;
        };
        return false;
        }
    }
   
 

