
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Adminempleados {
     private ArrayList<Empleados> listae = new ArrayList();
    private File archivo = null;
    
    public Adminempleados(String path) {
        archivo = new File(path);
    }

    public ArrayList<Empleados> getListaperson() {
        return listae;
    }

    public void setListaperson(ArrayList<Empleados> listaperson) {
        this.listae = listaperson;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listae=" + listae;
    }
    
    //extra mutador
    public void setperson(Empleados e) {
        this.listae.add(e);
    }
    
    public void CargarArchivo() {
        try {
            listae = new ArrayList();
            Empleados temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Empleados)objeto.readObject()) != null) {
                        listae.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void EscribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Empleados t : listae) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
