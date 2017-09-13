/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Comida extends Productos{
    private String marca2;

    public Comida() {
    }    

    public Comida(String marca2, int precio, String marca) {
        super(precio, marca);
        this.marca2 = marca2;
    }

    public String getMarca2() {
        return marca2;
    }

    public void setMarca2(String marca2) {
        this.marca2 = marca2;
    }

    @Override
    public String toString() {
        return "Comida{" + "marca2=" + marca2 + '}';
    }
    
}
