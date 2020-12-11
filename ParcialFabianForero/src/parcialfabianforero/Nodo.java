/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfabianforero;

/**
 *
 * @author estudiante
 */
public class Nodo {

    String info;
    Nodo sig;
    Nodo ant;

    public Nodo(String info) {
        this.info = info;
        sig = ant = null;
    }
}
