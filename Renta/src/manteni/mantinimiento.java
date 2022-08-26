package manteni;

public class mantinimiento {
    public  int reserva, canchas, hora, tiempo = 30, horario, cedula, tiempoReserva;
    public  String aseadora;
    public  boolean limpio;
    public  int horaFinal = hora + tiempoReserva;

    public void limpiar (int reserva, int hora, int tiempo, int horario, int canchas, int cedula, boolean limpio){
        if (hora == horaFinal){
            System.out.println("Hora de asear la cancha: "+canchas);
        }
    }
    
    public void balones(int hora, int horaFinal){
        if (hora <= horaFinal){
            System.out.println("Revisar e Inflar Balones");
        }
    }
    
    public void hacerMantenimiento() {
        limpiar(reserva, hora, tiempo, horario, canchas, cedula, limpio);
        balones(hora, horaFinal);
    }
}
