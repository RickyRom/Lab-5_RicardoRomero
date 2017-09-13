
import java.io.Serializable;
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
public class Mascotas implements Serializable{
    private String nombre;
    private String raza;
    private Date fecha;
    private String problema;
    private int numero_visitas;
    
    private static final long SerialVersionUID = 11L;

    public Mascotas() {
    }

    public Mascotas(String nombre, String raza, Date fecha, String problema, int numero_visitas) {
        this.nombre = nombre;
        this.raza = raza;
        this.fecha = fecha;
        this.problema = problema;
        this.numero_visitas = numero_visitas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public int getNumero_visitas() {
        return numero_visitas;
    }

    public void setNumero_visitas(int numero_visitas) {
        this.numero_visitas = numero_visitas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
