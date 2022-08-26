package renta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author golden
 */
public abstract class Renta {
 
    int id_reserva;
    int id_usuario;
    int cantGente;
    int cantObj;
    ArrayList<fecha> dispo;
    fecha fecha;
    Scanner sc=new Scanner(System.in);;

    public Renta(int id_reserva, int id_usuario, int cantGente) {
        this.id_reserva = id_reserva;
        this.id_usuario = id_usuario;
        this.cantGente = cantGente;
    }
    
    public abstract boolean hacerReserva();
    public abstract boolean vefDispo(String dia,String hora);
    
}
