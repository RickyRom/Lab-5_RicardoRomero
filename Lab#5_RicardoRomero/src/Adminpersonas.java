
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
public class Adminpersonas {
    private ArrayList<Personas> listaperson = new ArrayList();
    private File archivo = null;
    
    public Adminpersonas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Personas> getListaperson() {
        return listaperson;
    }

    public void setListaperson(ArrayList<Personas> listaperson) {
        this.listaperson = listaperson;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaperson=" + listaperson;
    }
    
    //extra mutador
    public void setperson(Personas p) {
        this.listaperson.add(p);
    }
    
    public void CargarArchivo() {
        try {
            listaperson = new ArrayList();
            Personas temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Personas)objeto.readObject()) != null) {
                        listaperson.add(temp);
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
            for (Personas t : listaperson) {
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
