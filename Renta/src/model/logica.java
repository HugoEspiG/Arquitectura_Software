package model;

import java.util.HashMap;

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

    public Usuario servicios(String user, String pwd) {
        Login l = new Login();
        if (l.validar(pwd, user) != null) {
            Usuario usuario = l.validar(pwd, user);
            if (l.validarAdmon(usuario)) {
                return usuario;
            } else {
                return usuario;
            }
        }
        return null;
    }

    public boolean hacerRese(String id_user, int cant_Gente, mantinimiento m, String serv) {
        Renta r;
        HashMap<String, Renta> hm = new HashMap<>();
        hm.put("Arbitro", new RentaArbitro(id_user, cant_Gente, m));
        hm.put("Cancha", new RentaArbitro(id_user, cant_Gente, m));
        hm.put("Balon", new RentaArbitro(id_user, cant_Gente, m));
        hm.put("Peto", new RentaArbitro(id_user, cant_Gente, m));

        r = hm.get(serv);

        if (r != null) {
            return r.hacerReserva();
        } else {
            return false;
        }

    }


    public Usuario registro(String pwd, String user, String identificacion, String nom) {
        Usuario s = new Usuario(identificacion, user, nom, identificacion, pwd,false);
        return s;
    }

}
