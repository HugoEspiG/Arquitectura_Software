package renta;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author golden
 */
public abstract class Renta {
 
    int id_reserva;
    int id_usuario;
    int cantGente;
    boolean dispo;
    int cantObj;
    int hora;
    Date fecha;

    public Renta(int id_reserva, int id_usuario, int cantGente) {
        this.id_reserva = id_reserva;
        this.id_usuario = id_usuario;
        this.cantGente = cantGente;
    }
    
    public abstract boolean hacerReserva();
    public abstract boolean vefDispo();
    
}
