package partidos;
import java.util.ArrayList;
import java.util.Scanner;

public class OrganizadorPartidos {
    
    ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    ArrayList<Partidos> partidos = new ArrayList<Partidos>();
    Scanner sc = new Scanner(System.in);

    String idUser;
    int cantJugadores;

    public OrganizadorPartidos(String idUser, int cantJugadores) {
        this.idUser = idUser;
        this.cantJugadores = cantJugadores;
    }

    
    public void crearPartidos(){
        boolean buscando;

        for(int i=0; i<equipos.size(); i++){
            if(equipos.get(i).buscandoPartido){
                equipos.get(i).setBuscandoPartido(false);
                buscando = false;
                partidos.add(new Partidos(equipos.get(i), new Equipo(cantJugadores, idUser, buscando)));
                System.out.println("¡Se ha asignado un partido!");
            }else{
                buscando = true;
                equipos.add(new Equipo(cantJugadores, idUser, buscando));
                System.out.println("No hay equipos disponibles para un partido, quedará en lista de espera..");
            }
        }
        
    }
    
    
}
