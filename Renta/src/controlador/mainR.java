package controlador;
import java.util.Scanner;
import renta.Renta;
import renta.RentaArbitro;
import renta.RentaBalon;
import renta.RentaCancha;
import renta.RentaPetos;

/**
 *
 * @author golden
 */
public class mainR {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);     
        mainR m=new mainR();
        String serv;
        System.out.println("Que servicio desea? ");
        serv=sc.nextLine();
        if(m.hacerRese(1, 1, 5,serv)){
            System.out.println("Reservado!");
        }

    }

    public void servicios (){
        sc = new Scanner(System.in);

        System.out.println("BIENVENIDO");
        System.out.println("Ingrese la opción que desee utilizar");
        System.out.println("1. Realizar una renta");
        System.out.println("2. Organizar un partido");
    }
    
    public boolean hacerRese(int id_user,int id_reser,int cant_Gente, String servDeseado){
        Renta r;
        switch (servDeseado) {
            case "arbitro" -> r=new RentaArbitro(id_user,id_reser,cant_Gente);
            case "balon" -> r=new RentaBalon(id_user,id_reser,cant_Gente);
            case "cancha" -> r=new RentaCancha(id_user,id_reser,cant_Gente);
            case "peto" -> r=new RentaPetos(id_user,id_reser,cant_Gente);
            default -> {
                System.out.println("Servicio no valido");
                r=null;
            }
        }
        return r.hacerReserva();
        
    }
}
