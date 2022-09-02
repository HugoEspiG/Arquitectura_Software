package renta;

import manteni.mantinimiento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author golden
 */
public class RentaArbitro extends Renta {

    public RentaArbitro(String id_usuario, int cantGente, mantinimiento m) {
        super(id_usuario, cantGente, m);
        //TODO Auto-generated constructor stub
    }


    @Override
    public boolean hacerReserva() {
        System.out.println("Dia de la reserva: ");
        String dia=super.sc.nextLine();
        System.out.println("Hora de la reserva: ");
        String hora=super.sc.nextLine();
        if(vefDispo(dia,hora)){
            dispo.add(new fecha(dia, hora, 1));
            id_reserva=g.cadenaAleatoria();
            return true;
        }else{
            return false;
        }
    }


    @Override
    public boolean vefDispo (String dia, String hora) {
        fecha=new fecha(dia, hora, 1);
        for(fecha f:super.dispo){
            if(f.equals(fecha)){
                return false;
            }
        }

        return true;
    }

    
}
