package Cola;

public class Cola {

    Nodo cab;
    Nodo cola;

    public Cola() {
        cab = null;
    }

    public boolean isVacia() {
        return (cab == null);
    }

    public void insertar(Nodo nuevo) {
        if (isVacia()) {
            cola = nuevo;
        } else {
            cab.ant = nuevo;
            nuevo.sig = cab;
        }
        cab = nuevo;
    }

    public Persona eliminar() {
        if (!isVacia()) {
            Persona elim;
            elim = cola.info;
            if (cola.ant != null) {
                cola = cola.ant;
                cola.sig = null;
            } else {
                cola = cab = null;
            }
            return elim;
        }
        return null;
    }

    @Override
    public String toString() {
        String mostrar = "      Cab\n       ↓\nnull↔";
        Nodo tmp = cab;
        while (tmp != null) {
            mostrar += "[" + tmp.info + "] ↔ ";
            tmp = tmp.sig;
        }
        return mostrar + "null";
    }

}
