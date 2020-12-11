
package parcialfabianforero;

/**
 *
 * @author estudiante
 */
public class Pila {

    Nodo cab;

    public Pila() {
        cab = null;
    }

    public boolean isVacia() {
        return (cab == null);
    }

     public void insertar(Nodo nuevo) {
        if (!isVacia()) {
            cab.ant = nuevo;
            nuevo.sig = cab;
        }
        cab = nuevo;
    }

    public String eliminar() {
        if (!isVacia()) {
            String elim = cab.info;
            cab = cab.sig;
            if (cab != null) {
                cab.ant = null;
            }
            return elim;
        }
        return null;
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
