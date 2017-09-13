
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
public class Perros extends Mascotas{
    private String tamaño;

    public Perros() {
    }

    public Perros(String tamaño, String nombre, String raza, Date fecha, String problema, int numero_visitas) {
        super(nombre, raza, fecha, problema, numero_visitas);
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perros{" + "tama\u00f1o=" + tamaño + '}';
    }
    
}
