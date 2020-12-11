package editorjava;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Pila pila = new Pila();
        Cola cola = new Cola();
        String texto;
        do {
            texto = tec.nextLine();
            if (!texto.equalsIgnoreCase("fin")) {
                cola.insertar(new Nodo(texto));
            }
        } while (!texto.equalsIgnoreCase("fin"));
        int cont=0;
        while (!cola.isVacia()) {
            String linea = cola.eliminar();
            cont++;
            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt(i) == '(' || linea.charAt(i) == '{' || linea.charAt(i) == '[') {
                    pila.insertar(new Nodo("" + linea.charAt(i)));
                } else if (linea.charAt(i) == ')' || linea.charAt(i) == '}' || linea.charAt(i) == ']') {
                    String ultimo = pila.eliminar();
                    if (linea.charAt(i) == ')' && !ultimo.equals("(")) {
                        System.out.println("ERROR en la línea "+cont+" se esperaba un )");
                    } else if (linea.charAt(i) == '}' && !ultimo.equals("{")) {
                        System.out.println("ERROR en la línea "+cont+" se esperaba un }");
                    } else if (linea.charAt(i) == ']' && !ultimo.equals("[")) {
                        System.out.println("ERROR en la línea "+cont+" se esperaba un ]");
                    }
                }
            }
        }
        if(pila.isVacia()){
            System.out.println("ENLAZANDO....");
        }

    }

}
