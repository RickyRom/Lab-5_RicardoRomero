
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Correas extends Productos{
    private int longitud;
    private String material;
    private Color color;

    public Correas() {
    }

    public Correas(int longitud, String material, Color color, int precio, String marca) {
        super(precio, marca);
        this.longitud = longitud;
        this.material = material;
        this.color = color;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Correas{" + "longitud=" + longitud + ", material=" + material + ", color=" + color + '}';
    }
    
}
