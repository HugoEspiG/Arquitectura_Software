package controlador;

import java.util.Scanner;


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
        // case 1:
        // String serv;
        // System.out.println("Que servicio desea? ");
        // serv = sc.nextLine();
        // if (hacerRese(1, 1, 5, serv)) {
        // System.out.println("Reservado!");
        // }
        // break;
        // case 2:
        // OrganizadorPartidos organizar = new OrganizadorPartidos();
        // organizar.crearPartidos();
        // break;
        // case 3:
        // mantinimiento m= new mantinimiento();

        // break;
        // case 4:
        // Tienda tienda = new Tienda();
        // tienda.hacerPedido();
        // break;
        // }
        Login l = new Login();
        System.out.println("Ingrese su usuario: ");
        String user = sc.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String pwd = sc.nextLine();
        if (l.validar(pwd, user) != null) {
            Usuario usuario = l.validar(pwd, user);
            if (l.validarAdmon(usuario)) {
                System.out.println("Admon");
            } else {
                menuUser(usuario);
            }
        } else {
            System.out.println("Usted no es un usuario existente, desea registrarse? ");
            String rep = sc.nextLine();
            if (rep.equals("Si")) {
                System.out.println("Ingrese su nombre");
                String nom = sc.nextLine();
                System.out.println("Ingrese su identificacion");
                String identificacion = sc.nextLine();
                Usuario s = new Usuario(identificacion, user,nom, identificacion, "Normal",pwd);
            } else {
                return;
            }
        }

    }

    public boolean hacerRese(String id_user, int cant_Gente,mantinimiento m) {
        Renta r;
        String serv;
        System.out.println("Que servicio desea? ");
        serv = sc.nextLine();
        switch (serv) {
            case "arbitro":r = new RentaArbitro(id_user, cant_Gente,m);break;
            case "balon": r = new RentaBalon(id_user, cant_Gente,m);break;
            case "cancha":r = new RentaCancha(id_user, cant_Gente,m);break;
            case "peto":r = new RentaPetos(id_user, cant_Gente,m);break;
            default:{
                System.out.println(serv);
                System.out.println("Servicio no valido");
                r = null;
            }
        }
        return r.hacerReserva();

    }

    public void menuUser(Usuario usuario){
        System.out.println("BIENVENIDO");
        System.out.println("Ingrese la opción que desee utilizar");
        System.out.println("1. Realizar una renta");
        System.out.println("2. Organizar un partido");
        System.out.println("4. Pedir comida");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                String serv;
                mantinimiento m = new mantinimiento();
                m.listaFechas();
                if (hacerRese(usuario.getIDUsuario(), 5,m)) {
                    System.out.println("Reservado!");
                }
            break;
            case 2:
                System.out.println("Cuantos jugadores tiene actualmente en su equipo");
                int cant=sc.nextInt();
                OrganizadorPartidos organizar = new OrganizadorPartidos(usuario.getIDUsuario(),cant);
                organizar.crearPartidos();
            break;
            case 3:
                Tienda tienda = new Tienda();
                tienda.hacerPedido();
            break;
        }        
    }

}
