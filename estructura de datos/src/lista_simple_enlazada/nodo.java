
package lista_simple_enlazada;


public class nodo {
    private nodo siguiente;
    private persona datos;

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    public persona getDatos() {
        return datos;
    }

    public void setDatos(persona datos) {
        this.datos = datos;
    }
    
    public nodo(persona dato,nodo siguiente){
        
        this.siguiente=siguiente;
        this.datos=dato;
    } 
    
}
