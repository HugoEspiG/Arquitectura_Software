package renta;

import manteni.mantinimiento;

/**
 *
 * @author golden
 */
public class RentaBalon extends Renta {

    public RentaBalon(String id_usuario, int cantGente, mantinimiento m) {
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
            dispo.add(new fecha(dia, hora, 2));
            id_reserva=g.cadenaAleatoria();
            return true;
        }else{
            return false;
        }
    }


    @Override
    public boolean vefDispo (String dia, String hora) {
        fecha=new fecha(dia, hora, 2);
        for(fecha f:super.dispo){
            if(f.equals(fecha)){
                return false;
            }
        }

        return true;
    }    
}
