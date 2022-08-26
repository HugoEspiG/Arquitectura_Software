package mantenimiento;
// import javax.swing.Timer;
// import javax.swing.*;
// import java.awt.*;
// import java.util.TimerTask;

public class Mantenimiento {

    public static int reserva, canchas, hora, tiempo = 30, horario, cedula, tiempoReserva;
    public static String aseadora;
    public static boolean limpio;
    public static int horaFinal = hora + tiempoReserva;
    
    public static void limpiar (int reserva, int hora, int tiempo, int horario, int canchas, int cedula, boolean limpio){
        if (hora == horaFinal){
            System.out.println("Hora de asear la cancha: "+canchas);
        }
    }
    
    public static void balones(int hora, int horaFinal){
        if (hora <= horaFinal){
            System.out.println("Revisar e Inflar Balones");
        }
    }
    
    public static void main(String args[]) {
        Mantenimiento.limpiar(reserva, hora, tiempo, horario, canchas, cedula, limpio);
        Mantenimiento.balones(hora, horaFinal);
    }
}