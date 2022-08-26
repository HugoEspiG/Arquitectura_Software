/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;
import java.util.ArrayList;
import java.util.Scanner;

public class OrganizadorPartidos {
    
    ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    String cancha;
    Partidos[] partidos;
    Scanner sc = new Scanner(System.in);
    
    public void mezclarEquipos(ArrayList<Equipo> equipos){
        int j = equipos.size()-1;
        for(int i=0; i<(equipos.size()/2);i++){
            partidos[i] = new Partidos(equipos.get(i),equipos.get(j));
            j--;
        }
    }

    public void ingresarEquipo() {
        
        System.out.println("Ingrese el nombre del equipo:\n");
        String nombre = sc.next();
        Jugadores[] jugadores = new Jugadores[5];
        
        for(int i=0; i<5 ; i++){
            System.out.println("ingrese el nombre del jugador (sin espacio):\n");
            String nombreJ = sc.next();
            System.out.println("ingrese la identificación del usuario:\n");
            String id = sc.next();
            jugadores[i] = new Jugadores(nombreJ, id);
        }
        
        Equipo equipo = new Equipo(jugadores, nombre);
        equipos.add(equipo);
        
    }
    
    public void crearPartidos(){
        Boolean salir = true;
        while(salir){
            System.out.println("-------CREAR PARTIDOS-------");
            System.out.println("1. Ingresar un equipo");
            System.out.println("2. Generar partidos (minimo 2 equipos)");
            System.out.println("3. Salir");
            int opc = sc.nextInt();

            switch(opc){
                case 1:
                    ingresarEquipo();
                break;

                case 2:
                    mezclarEquipos(equipos);
                break;

                case 3:
                    salir=false;
                    System.out.println("Saliendo del generador de partidos...");
                break;
            }
        }
        
    }
    
    
}
