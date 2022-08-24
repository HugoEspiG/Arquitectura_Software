/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
public class main {


    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);     
        main m=new main();
        String serv;
        System.out.println("Que servicio desea? ");
        serv=sc.nextLine();
        if(m.hacerRese(1, 1, 5,serv)){
            System.out.println("Reservado!");
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
