
package tad;

public class Principal {

    public static void main(String[] args) {
        ABB arbol= new ABB();
        arbol.insertar(10);
        arbol.insertar(7);        
        arbol.insertar(17);
        arbol.insertar(4);
        arbol.insertar(3);
        arbol.insertar(20);
        arbol.insertar(19);
        arbol.insertar(18);
        arbol.insertar(25);  
        System.out.println("Preorden-> "+arbol.preOrden());
        System.out.println("Inorden-> "+arbol.inOrden());
        System.out.println("Posorden-> "+arbol.posOrden());
        System.out.println("Sumatoria-> "+arbol.sumatoria());
        System.out.println("Número de Nodos-> "+arbol.contar());
        System.out.println("Eliminado el 7-> "+arbol.eliminar(3));
        System.out.println("Inorden-> "+arbol.inOrden());        
        
    }
    
}
