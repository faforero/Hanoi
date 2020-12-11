
package tad;

public class Nodo {
    public int info;
    public Nodo der;
    public Nodo izq;
    
    Nodo(int info){
        this.info=info;
        der=izq=null;
    }
}
