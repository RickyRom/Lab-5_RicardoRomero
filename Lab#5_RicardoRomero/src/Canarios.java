
import java.awt.Color;
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
public class Canarios extends Mascotas{
    private Color color;

    public Canarios() {
    }

    public Canarios(Color color, String nombre, String raza, Date fecha, String problema, int numero_visitas) {
        super(nombre, raza, fecha, problema, numero_visitas);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Canarios{" + "color=" + color + '}';
    }
    
}
