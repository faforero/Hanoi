package Hanoi;

import Pila.*;

public class Pila {

    Nodo cab;

    public Pila() {
        cab = null;
    }

    public boolean isVacia() {
        return (cab == null);
    }

    public boolean mover(Pila x){
        int tmp=atender();
        if(x.apilar(new Nodo(tmp))){
         return true;   
        }else{
            apilar(new Nodo(tmp));
            return false;
        }
        
    }
            
    
    public boolean apilar(Nodo nuevo) {
        if (isVacia()) {
            cab = nuevo;
            return true;
        } else if (nuevo.info<cab.info) {
            cab.ant = nuevo;
            nuevo.sig = cab;
            cab = nuevo;
            return true;
        }
        return false;
    }

    public int atender() {
        if (!isVacia()) {
            int elim = cab.info;
            cab = cab.sig;
            if (cab != null) {
                cab.ant = null;
            }
            return elim;
        }
        return -1;
    }

    public boolean buscar(int x) {
        Nodo tmp = cab;
        while (tmp != null) {
            if (tmp.info == x) {
                return true;
            }
            tmp = tmp.sig;
        }
        return false;
    }

    @Override
    public String toString() {
        String mostrar = "null↔";
        Nodo tmp = cab;
        while (tmp != null) {
            mostrar += "[" + tmp.info + "] ";
            tmp = tmp.sig;
        }
        return mostrar + "null";
    }

}
