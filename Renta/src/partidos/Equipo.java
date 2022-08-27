/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;

public class Equipo {
    int cantjugadores;
    String idCapitan;
    boolean buscandoPartido;

    public Equipo(int cantjugadores, String idCapitan, boolean buscandoPartido) {
        this.cantjugadores = cantjugadores;
        this.idCapitan = idCapitan;
        this.buscandoPartido = buscandoPartido;
    }

    public void setCantjugadores(int cantjugadores) {
        this.cantjugadores = cantjugadores;
    }

    public void setIdCapitan(String idCapitan) {
        this.idCapitan = idCapitan;
    }

    public void setBuscandoPartido(boolean buscandoPartido) {
        this.buscandoPartido = buscandoPartido;
    }
    
    
    // public Equipo(Jugadores[] jugadores, String nombreEquipo) {
    //     this.jugadores = jugadores;
    //     this.nombreEquipo = nombreEquipo;
    // }
    
    
}
