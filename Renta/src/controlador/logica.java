package controlador;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import login.Login;
import login.Usuario;
import manteni.mantinimiento;
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
public class logica {
    private static Scanner sc;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        logica m = new logica();
        m.servicios();
    }


    public void servicios() {
        sc = new Scanner(System.in);

        // System.out.println("BIENVENIDO");
        // System.out.println("Ingrese la opción que desee utilizar");
        // System.out.println("1. Realizar una renta");
        // System.out.println("2. Organizar un partido");
        // System.out.println("3. Realizar mantenimiento");
        // System.out.println("4. Pedir comida");
        // int opc = sc.nextInt();

        // switch (opc) {
        //     case 1:
        //         String serv;
        //         System.out.println("Que servicio desea? ");
        //         serv = sc.nextLine();
        //         if (hacerRese(1, 1, 5, serv)) {
        //             System.out.println("Reservado!");
        //         }
        //     break;
        //     case 2:
        //         OrganizadorPartidos organizar = new OrganizadorPartidos();
        //         organizar.crearPartidos();
        //     break;
        //     case 3:
        //         mantinimiento m= new mantinimiento();
                
        //     break;
        //     case 4:
        //         Tienda tienda = new Tienda();
        //         tienda.hacerPedido();
        //     break;
        // }        
        Login l = new Login();
        System.out.println("Ingrese su usuario: ");
        String user= sc.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String pwd= sc.nextLine();
        if(l.validarAdmon(user,pwd)){

        }else if(l.validar(user,pwd)){
            menuUser();
        }else{
            System.out.println("Usted no es un usuario existente, desea registrarse? ");
            String rep=sc.nextLine();
            if(rep.equals("Si")){
            System.out.println("Ingrese su nombre");
            String nom=sc.nextLine();
            System.out.println("Ingrese su identificacion");
            String identificacion=sc.nextLine();
            Usuario s = new Usuario(identificacion, user,pwd, identificacion,"Normal");
        }else{
            return;
        }
        }

    }

    public boolean hacerRese(int id_user,int cant_Gente, String servDeseado){
        Renta r;
        switch (servDeseado) {
            case "arbitro" -> r=new RentaArbitro(id_user,cant_Gente);
            case "balon" -> r=new RentaBalon(id_user,cant_Gente);
            case "cancha" -> r=new RentaCancha(id_user,cant_Gente);
            case "peto" -> r=new RentaPetos(id_user,cant_Gente);
            default -> {
                System.out.println("Servicio no valido");
                r=null;
            }
        }
        return r.hacerReserva();
        
    }
    
    public void menuUser(){
        System.out.println("BIENVENIDO");
        System.out.println("Ingrese la opción que desee utilizar");
        System.out.println("1. Realizar una renta");
        System.out.println("2. Organizar un partido");
        System.out.println("4. Pedir comida");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                String serv;
                System.out.println("Que servicio desea? ");
                serv = sc.nextLine();
                mantinimiento m = new mantinimiento();
                m.listaFechas();
                if (hacerRese(l.id, 5, serv)) {
                    System.out.println("Reservado!");
                }
            break;
            case 2:
                System.out.println("Cuantos jugadores tiene actualmente en su equipo");
                int cant=sc.nextInt();
                OrganizadorPartidos organizar = new OrganizadorPartidos(l.id¿?,cant);
                organizar.crearPartidos();
            break;
            case 3:
                Tienda tienda = new Tienda();
                tienda.hacerPedido();
            break;
        }        
    }
    
}
