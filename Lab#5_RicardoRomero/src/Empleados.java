
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
public class Empleados extends Personas{
    private String rol;
    private int horario_e;
    private int horario_s;
    private int sueldo;
    private String usuario;
    private String contra;

    public Empleados() {
    }

    public Empleados(String rol, int horario_s, int sueldo, String usuario, String contra, String ID, Date fecha, String nombre) {
        super(ID, fecha, nombre);
        this.rol = rol;
        this.horario_s = horario_s;
        this.sueldo = sueldo;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getHorario_e() {
        return horario_e;
    }

    public void setHorario_e(int horario_e) {
        this.horario_e = horario_e;
    }

    public int getHorario_s() {
        return horario_s;
    }

    public void setHorario_s(int horario_s) {
        this.horario_s = horario_s;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Empleados{" + "rol=" + rol + ", horario_e=" + horario_e + ", horario_s=" + horario_s + ", sueldo=" + sueldo + ", usuario=" + usuario + ", contra=" + contra + '}';
    }
    
}
