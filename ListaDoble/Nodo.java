
package ListaDoble;

public class Nodo {
    Persona info;
    Nodo sig;
    Nodo ant;
    
    public Nodo(Persona info){
        this.info=info;
        sig=ant=null;        
    }
}
