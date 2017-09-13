
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Productos implements Serializable{
    private int precio;
    private String marca;
    
    private static final long SerialVersionUID = 12L;

    public Productos() {
    }

    public Productos(int precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Productos{" + "precio=" + precio + ", marca=" + marca + '}';
    }
    
}
