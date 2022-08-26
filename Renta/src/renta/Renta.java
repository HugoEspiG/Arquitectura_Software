package renta;
import java.util.ArrayList;
import java.util.Scanner;

import Generador_alfaNumericos.generador;
/**
 *
 * @author golden
 */
public abstract class Renta {
 
    String id_reserva;
    int id_usuario;
    int cantGente;
    int cantObj;
    ArrayList<fecha> dispo;
    fecha fecha;
    Scanner sc=new Scanner(System.in);;

    public Renta(int id_usuario, int cantGente) {
        generador g = new generador();
        this.id_reserva = g.cadenaAleatoria();
        this.id_usuario = id_usuario;
        this.cantGente = cantGente;
    }
    
    public abstract boolean hacerReserva();
    public abstract boolean vefDispo(String dia,String hora);
    
}
