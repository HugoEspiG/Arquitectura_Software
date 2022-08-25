package renta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author golden
 */
public class RentaCancha extends Renta {

    public RentaCancha(int id_reserva, int id_usuario, int cantGente) {
        super(id_reserva, id_usuario, cantGente);
    }
    
    @Override
    public boolean hacerReserva() {
        System.out.println("Dia de la reserva: ");
        String dia=super.sc.nextLine();
        System.out.println("Hora de la reserva: ");
        String hora=super.sc.nextLine();
        if(vefDispo(dia,hora)){
            dispo.add(new fecha(dia, hora, 3));
            return true;
        }else{
            return false;
        }
    }


    @Override
    public boolean vefDispo (String dia, String hora) {
        fecha=new fecha(dia, hora, 3);
        for(fecha f:super.dispo){
            if(f.equals(fecha)){
                return false;
            }
        }

        return true;
    }
}
