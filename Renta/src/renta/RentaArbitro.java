package renta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author golden
 */
public class RentaArbitro extends Renta {

    public RentaArbitro(int id_reserva, int id_usuario, int cantGente) {
        super(id_reserva, id_usuario, cantGente);
    }

    
    @Override
    public boolean hacerReserva() {
        return true;
    }

    @Override
    public boolean vefDispo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
