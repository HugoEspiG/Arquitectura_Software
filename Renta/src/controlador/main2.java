package controlador;
import java.util.Scanner;

import mantenimiento.Mantenimiento;
import partidos.OrganizadorPartidos;
import renta.Renta;
import renta.RentaArbitro;
import renta.RentaBalon;
import renta.RentaCancha;
import renta.RentaPetos;
import tiendas.Tienda;

/**
 *
 * @author golden
 */
public class main2 {
    private static Scanner sc;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        main2 m = new main2();
        m.servicios();
    }


    public void servicios() {
        sc = new Scanner(System.in);

        System.out.println("BIENVENIDO");
        System.out.println("Ingrese la opción que desee utilizar");
        System.out.println("1. Realizar una renta");
        System.out.println("2. Organizar un partido");
        System.out.println("3. Realizar mantenimiento");
        System.out.println("4. Pedir comida");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                String serv;
                System.out.println("Que servicio desea? ");
                serv = sc.nextLine();
                if (hacerRese(1, 1, 5, serv)) {
                    System.out.println("Reservado!");
                }
            break;
                
            case 2:
                OrganizadorPartidos organizar = new OrganizadorPartidos();
                organizar.crearPartidos();
            break;

            case 3:
                Mantenimiento mantenimiento = new Mantenimiento();
                mantenimiento.hacerMantenimiento();
            break;

            case 4:
                Tienda tienda = new Tienda();
                tienda.hacerPedido();

            break;

        }

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
