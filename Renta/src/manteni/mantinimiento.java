package manteni;

import java.util.ArrayList;

import renta.fecha;

public class mantinimiento {
    public  int reserva, canchas, hora, tiempo = 30, horario, cedula, tiempoReserva;
    public  String aseadora;
    public  boolean limpio;
    public  int horaFinal = hora + tiempoReserva;
    public ArrayList<fecha> diasDispo;
    
    public mantinimiento(){
        diasDispo= new ArrayList<>();
    }

    public void limpiarC (int dia,int hora){
        diasDispo.add(new fecha(String.valueOf(dia),String.valueOf(hora), 3));
    }
    
    public void balones(int dia,int hora){
        diasDispo.add(new fecha(String.valueOf(dia),String.valueOf(hora), 3));
    }

    public ArrayList<fecha> listaFechas(){    
        return diasDispo; 
    }
}
