package editorjava;

public class Nodo {
    String info;
    Nodo sig;
    Nodo ant;

    public Nodo(String info){
        this.info=info;
        sig=ant=null;
    }
}
