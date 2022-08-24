/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;

public class Equipo {
    Jugadores[] jugadores = new Jugadores[5];
    String nombreEquipo;

    public Equipo(Jugadores[] jugadores, String nombreEquipo) {
        this.jugadores = jugadores;
        this.nombreEquipo = nombreEquipo;
    }
    
    
}
