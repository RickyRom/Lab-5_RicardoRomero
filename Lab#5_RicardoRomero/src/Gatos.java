
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Gatos extends Mascotas{
    private Boolean pelaje;

    public Gatos() {
    }
    
    public Gatos(Boolean pelaje, String nombre, String raza, Date fecha, String problema, int numero_visitas) {
        super(nombre, raza, fecha, problema, numero_visitas);
        this.pelaje = pelaje;
    }

    public Boolean getPelaje() {
        return pelaje;
    }

    public void setPelaje(Boolean pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Gatos{" + "pelaje=" + pelaje + '}';
    }
    
    
}
