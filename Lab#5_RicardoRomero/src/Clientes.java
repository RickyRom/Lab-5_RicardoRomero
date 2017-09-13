
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
public class Clientes extends Personas{
    private String mascota;
    private String productos;
    private String turno;
    private int efectivo;

    public Clientes() {
    }

    public Clientes(String mascota, String productos, String turno, int efectivo, String ID, Date fecha, String nombre) {
        super(ID, fecha, nombre);
        this.mascota = mascota;
        this.productos = productos;
        this.turno = turno;
        this.efectivo = efectivo;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "mascota=" + mascota + ", productos=" + productos + ", turno=" + turno + ", efectivo=" + efectivo + '}';
    }
    
}
