package lista_simple_enlazada;

import javax.swing.JOptionPane;

public class lista {

    private nodo inicio;
    private nodo fin;

    public lista() {
        inicio = null;
        fin = null;
    }

    public boolean estavacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertar(persona persona) {
        nodo actual;
        if (estavacia()) {//si es verdadero, es decir la lista esta vacia
            actual = new nodo(persona, null);
            inicio = actual;
            fin = actual;
        } else {
            actual = new nodo(persona, null);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }

    public void mostar() {
        if (estavacia()) {
            JOptionPane.showMessageDialog(null, "la lista esta vacia");
            return;
        } else {
            nodo temporal;
            temporal = inicio;
            while (temporal != null) {
                JOptionPane.showMessageDialog(null, temporal.getDatos().toString());
                temporal = temporal.getSiguiente();

            }
        }
    }

    public void buscar_por_nombre(String nombre) {
        if (estavacia()) {
            JOptionPane.showMessageDialog(null, "la lista esta vacia");
            return;
        } else {
            nodo temporal;
            temporal = inicio;

            while (temporal != null) {
                if (nombre == temporal.getDatos().getAnombre()) {

                }
                JOptionPane.showMessageDialog(null, temporal.getDatos().toString());
                break;

            }
            temporal = temporal.getSiguiente();

        }

    }
    
    public void buscar_por_edad(int edad){
          if (estavacia()) {
            JOptionPane.showMessageDialog(null, "la lista esta vacia");
            return;
        } else {
            nodo temporal;
            temporal = inicio;

            while (temporal != null) {
                if (edad == temporal.getDatos().getEdad()) {

                }
                JOptionPane.showMessageDialog(null, temporal.getDatos().toString());
                break;

            }
            temporal = temporal.getSiguiente();

        }
    }
}
