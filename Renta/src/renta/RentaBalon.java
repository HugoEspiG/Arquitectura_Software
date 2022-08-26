package renta;

/**
 *
 * @author golden
 */
public class RentaBalon extends Renta {

    public RentaBalon(int id_reserva, int id_usuario, int cantGente) {
        super(id_reserva, id_usuario, cantGente);
    }

    @Override
    public boolean hacerReserva() {
        System.out.println("Dia de la reserva: ");
        String dia=super.sc.nextLine();
        System.out.println("Hora de la reserva: ");
        String hora=super.sc.nextLine();
        if(vefDispo(dia,hora)){
            dispo.add(new fecha(dia, hora, 2));
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
