package Cola;

import ListaDoble.*;
import java.util.Scanner;

public class Principal {

    public static Scanner tec = new Scanner(System.in);
    
    public static void main(String[] args) {
        Cola x= new Cola();
        x.insertar(new Nodo(new Persona(123,"Juan",true)));
        x.insertar(new Nodo(new Persona(123,"Pedro",true)));
        x.insertar(new Nodo(new Persona(123,"Pablo",true)));
        x.insertar(new Nodo(new Persona(123,"Ana",false)));
        
        System.out.println(x);
       x.eliminar();
        System.out.println(x);
       x.eliminar();
        System.out.println(x);
       x.eliminar();
        System.out.println(x);
       x.eliminar();
        System.out.println(x);
       x.eliminar();
        System.out.println(x);
       x.eliminar();
        System.out.println(x);
       x.eliminar();
        System.out.println(x);
       x.eliminar();
        System.out.println(x);
        
    }

}