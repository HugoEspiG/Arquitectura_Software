package renta;
import java.util.ArrayList;
import java.util.Scanner;

import Generador_alfaNumericos.generador;
/**
 *
 * @author golden
 */
import manteni.mantinimiento;
public abstract class Renta {
 
    String id_reserva;
    String id_usuario;
    int cantGente;
    int cantObj;
    ArrayList<fecha> dispo;
    fecha fecha;
    mantinimiento m;
    generador g ;
    Scanner sc=new Scanner(System.in);;

    public Renta(String id_usuario, int cantGente,mantinimiento m) {
        g= new generador();
        this.id_reserva = g.cadenaAleatoria();
        this.id_usuario = id_usuario;
        this.cantGente = cantGente;
        this.m=m;
        dispo=m.listaFechas();
    }
    
    public abstract boolean hacerReserva();
    public abstract boolean vefDispo(String dia,String hora);
    
}
