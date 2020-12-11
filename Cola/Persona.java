/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

import ListaDoble.*;
import tad.*;

/**
 *
 * @author estudiante
 */
public class Persona {
    private int id;
    private String nombre;
    private boolean sexo;

    public Persona(int id, String nombre, boolean sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
    }
    
    public Persona(int id) {
        this.id = id;
        this.nombre = "NN";
        this.sexo = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return ((sexo)?"Sr. ":"Sra. ")+ nombre + "(" + id + ')';
    }
    
    
}
