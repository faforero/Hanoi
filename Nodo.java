
package Hanoi;

import Pila.*;

public class Nodo {
    int info;
    Nodo sig;
    Nodo ant;
    
    public Nodo(int info){
        this.info=info;
        sig=ant=null;        
    }
}
