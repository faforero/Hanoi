
package ListaDoble;

public class Principal {

    public static void main(String[] args) {
        ListaDoble x=new ListaDoble();
        ListaDoble eliminados=new ListaDoble();
        x.insertarCab(new Nodo(new Persona(123,"Juan",true)));
        x.insertarCab(new Nodo(new Persona(456,"Ana",false)));
        x.insertarCab(new Nodo(new Persona(789,"José",true)));
        
        System.out.println(x);
        System.out.println("\n\nEliminando...");
        eliminados.insertarCola(new Nodo(x.eliminar(456)));
        System.out.println("Original");
        System.out.println(x);
        System.out.println("Eliminados");
        System.out.println(eliminados);
    }
    
}
