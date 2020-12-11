package preParcial;


public class Lista {

    public Nodo cab;

    public Lista() {
        cab = null;
    }

    public boolean vacia() {
        return (cab == null);
    }

    public Nodo eliminarCab() {
        if (!vacia()) {
            Nodo eliminado=new Nodo(cab.info);
            cab = cab.sig;
            return eliminado;
        }
        return null;
    }

    public boolean eliminarCola() {
        if (!vacia()) {
            if (cab.sig != null) {
                Nodo tmp = cab;
                while (tmp.sig.sig != null) {
                    tmp = tmp.sig;
                }
                tmp.sig = null;
                return true;
            }
            cab = null;
            return true;
        }
        return false;
    }

    public boolean eliminarValor(int infoId) {
        if (!vacia()) {
            if (cab.info == infoId) {
                cab = cab.sig;
                return true;
            }
            Nodo tmp = cab, aux = cab;
            while (tmp != null) {
                if (tmp.info== infoId) {
                    aux.sig = tmp.sig;
                    return true;
                }
                aux = tmp;
                tmp = tmp.sig;
            }
        }
        return false;
    }

    public boolean eliminarPosicion(int pos) {
        if (!vacia()) {
            if (pos == 0) {
                cab = cab.sig;
            }
            if (pos > 0) {
                int cont = 0;
                Nodo tmp = cab;
                while (tmp != null && cont < pos - 1) {
                    tmp = tmp.sig;
                    cont++;
                }
                if (tmp != null && tmp.sig != null) {
                    tmp.sig = tmp.sig.sig;
                }
            }
        }
        return false;
    }

    public void borrar() {
        cab = null;
    }

    public void insertarCab(Nodo nuevo) {
        if (vacia()) {
            cab = nuevo;
        } else {
            nuevo.sig = cab;
            cab = nuevo;
        }
    }

    public void insertarCola(Nodo nuevo) {
        if (vacia()) {
            cab = nuevo;
        } else {
            Nodo tmp = cab;
            while (tmp.sig != null) {
                tmp = tmp.sig;
            }
            tmp.sig = nuevo;
        }
    }

    @Override
    public String toString() {
        String mostrar = "cab->";
        Nodo tmp = cab;
        while (tmp != null) {
            mostrar += "["+tmp.info + "]-> ";
            tmp = tmp.sig;
        }
        return mostrar + "null";
    }

    public int buscar(int infoId) {
        int cont = -1;
        Nodo tmp = cab;
        while (tmp != null) {
            cont++;
            if (tmp.info == infoId) {
                return cont;
            }
            tmp = tmp.sig;
        }
        return -1;
    }

    public boolean reemplazar(int infoId, int infoIdNueva) {
        Nodo tmp = cab;
        while (tmp != null) {
            if (tmp.info== infoId) {
                tmp.info=(infoIdNueva);
                return true;
            }
            tmp = tmp.sig;
        }
        return false;
    }

    public boolean reemplazar(int infoId, int copia, int infoIdNueva) {
        Nodo tmp = cab;
        int cont = 0;
        while (tmp != null) {
            if (tmp.info == infoId) {
                cont++;
                if (cont == copia) {
                    tmp.info=(infoIdNueva);
                    return true;
                }
            }
            tmp = tmp.sig;
        }
        return false;
    }
    
    public Lista filtrarPar(){
        Lista n=new Lista();
        Nodo tmp=cab;
        while(tmp!=null){
            if(tmp.info%2==0 && tmp.info!=0)
            {   
                n.insertarCola(new Nodo(tmp.info));
            }
            tmp=tmp.sig;
        }
        return n;
    }

    public int mayor(){
        int mayor=0;
        Nodo tmp=cab;
        while(tmp!=null){
            if(tmp.info>mayor){
                mayor=tmp.info;
            }
            tmp=tmp.sig;
        }
        return mayor;
    }
    public int menor(){
        int menor=1000;
        Nodo tmp=cab;
        while(tmp!=null){
            if(tmp.info<menor){
                menor=tmp.info;
            }
            tmp=tmp.sig;
        }
        return menor;
    }
    
}
