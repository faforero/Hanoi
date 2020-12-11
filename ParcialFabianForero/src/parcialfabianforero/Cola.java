package parcialfabianforero;

/**
 *
 * @author estudiante
 */
public class Cola {

    Nodocola cab;
    Nodocola cola;

    public Cola() {
        cab = null;
    }

    public boolean isVacia() {
        return (cab == null);
    }

    public void insertar(Nodocola nuevo) {
        if (isVacia()) {
            cola = nuevo;
        } else {
            cab.ant = nuevo;
            nuevo.sig = cab;
        }
        cab = nuevo;
    }

    public void recorrer(Nodocola nuevo){
        
    }
    @Override
    public String toString() {
        String mostrar = "      Cab\n       ↓\n null↔";
        Nodocola tmp = cab;
        while (tmp != null) {
            mostrar += "[" + tmp.info + "] ↔ ";
            tmp = tmp.sig;
        }
        return mostrar + "null";
    }
}
