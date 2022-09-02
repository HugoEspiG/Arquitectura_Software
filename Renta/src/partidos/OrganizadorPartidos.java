package partidos;
import java.util.ArrayList;
import java.util.Scanner;

public class OrganizadorPartidos {
    
    ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    ArrayList<Partidos> partidos = new ArrayList<Partidos>();

    String idUser;
    int cantJugadores;

    public OrganizadorPartidos(String idUser, int cantJugadores) {
        this.idUser = idUser;
        this.cantJugadores = cantJugadores;
    }

    
    public Partidos crearPartidos(){
        boolean buscando;
        Partidos partido = new Partidos();

        for(int i=0; i<equipos.size(); i++){
            if(equipos.get(i).buscandoPartido){
                equipos.get(i).setBuscandoPartido(false);
                buscando = false;
                partido = new Partidos(equipos.get(i), new Equipo(cantJugadores, idUser, buscando));
            }else{
                buscando = true;
                equipos.add(new Equipo(cantJugadores, idUser, buscando));
                
            }
        }

        return partido;
        
    }
    
    
}
