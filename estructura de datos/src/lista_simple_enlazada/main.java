package lista_simple_enlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author Raul garcia
 */
public class main {

    public static void main(String[] args) {
        lista l = new lista();
        int op = 0;
        do {
            String opcion = JOptionPane.showInputDialog(null, "lista simple\n 1-insertar \n 2.mostrar  \n 3-buscar por nombre \n 4-buscar por edad \n 6-salir");
            op = Integer.parseInt(opcion);
            switch (op) {
                case 1: {
                    String nombre, apellido, annos;
                    int edad;
                    nombre = JOptionPane.showInputDialog(null, "ingrese su nombre");
                    apellido = JOptionPane.showInputDialog(null, "ingrese su apellido");
                    annos = JOptionPane.showInputDialog(null, "ingrese su edad");
                    edad = Integer.parseInt(annos);
                    l.insertar(new persona(nombre, apellido, edad));
                    break;
                }
                case 2: {
                    l.mostar();
                    break;
                }
                
                case 3:{
                    String nombre = JOptionPane.showInputDialog(null,"ingrese el nombre a buscar");
                    l.buscar_por_nombre(nombre);
                }
                
                case 4:{
                    String edad = JOptionPane.showInputDialog(null,"ingrese la edad a buscar");
                    int edadb = Integer.parseInt(edad);
                    l.buscar_por_edad(edadb);
                        
                }

            }
        } while (op != 6);
    }
}
