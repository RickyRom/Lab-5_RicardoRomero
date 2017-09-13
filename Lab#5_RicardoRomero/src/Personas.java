
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
public class Personas {
    private String ID;
    private Date fecha;
    private String nombre;

    public Personas() {
    }    

    public Personas(String ID, Date fecha, String nombre) {
        this.ID = ID;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personas{" + "ID=" + ID + ", fecha=" + fecha + ", nombre=" + nombre + '}';
    }
    
}
