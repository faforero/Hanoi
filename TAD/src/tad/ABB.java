package tad;

public class ABB {

    Nodo raiz;

    ABB() {
        raiz = null;
    }

    public boolean isVacio() {
        return (raiz == null);
    }

//    public void insertar(Nodo nuevo) {
//        if (isVacio()) {
//            raiz = nuevo;
//        } else {
//            Nodo tmp = raiz;
//            Nodo aux = tmp;
//            while (tmp != null) {
//                aux = tmp;
//                if (nuevo.info > tmp.info) {
//                    tmp = tmp.der;
//                } else if (nuevo.info < tmp.info) {
//                    tmp = tmp.izq;
//                } else {
//                    break;
//                }
//            }
//            if (nuevo.info > aux.info) {
//                aux.der = nuevo;
//            } else if (nuevo.info < aux.info) {
//                aux.izq = nuevo;
//            }
//
//        }
//    }
    public boolean insertar(int info) {
        if (isVacio()) {
            raiz = new Nodo(info);
            return true;
        } else {
            return insertar(new Nodo(info), raiz);
        }
    }

    private boolean insertar(Nodo nuevo, Nodo raiz) {
        if (nuevo.info > raiz.info) {
            if (raiz.der == null) {
                raiz.der = nuevo;
            } else {
                return insertar(nuevo, raiz.der);
            }
        } else if (nuevo.info < raiz.info) {
            if (raiz.izq == null) {
                raiz.izq = nuevo;
            } else {
                return insertar(nuevo, raiz.izq);
            }
        }
        return false;

    }

    public String preOrden() {
        return preOrden(raiz);
    }

    private String preOrden(Nodo raiz) {
        if (raiz == null) {
            return "";
        } else {
            return raiz.info + " - " + inOrden(raiz.izq) + inOrden(raiz.der);
        }
    }

    public int sumatoria() {
        return sumatoria(raiz);
    }

    private int sumatoria(Nodo raiz) {
        if (raiz == null) {
            return 0;
        } else {
            return raiz.info + sumatoria(raiz.izq) + sumatoria(raiz.der);
        }
    }

    public int contar() {
        return contar(raiz);
    }

    private int contar(Nodo raiz) {
        if (raiz == null) {
            return 0;
        } else {
            return 1 + contar(raiz.izq) + contar(raiz.der);
        }
    }

    public String inOrden() {
        return inOrden(raiz);
    }

    private String inOrden(Nodo raiz) {
        if (raiz == null) {
            return "";
        } else {
            return inOrden(raiz.izq) + raiz.info + " - " + inOrden(raiz.der);
        }
    }

    public String posOrden() {
        return posOrden(raiz);
    }

    private String posOrden(Nodo raiz) {
        if (raiz == null) {
            return "";
        } else {
            return inOrden(raiz.izq) + inOrden(raiz.der) + raiz.info + " - ";
        }
    }

    public boolean buscar(int info) {
        Nodo tmp = raiz;
        while (tmp != null) {
            if (info > tmp.info) {
                tmp = tmp.der;
            } else if (info < tmp.info) {
                tmp = tmp.izq;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(int info) {
        Nodo tmp = raiz;
        Nodo ant = tmp;
        while (tmp != null) {
            if (tmp.info != info) {
                ant = tmp;
            }
            if (info > tmp.info) {
                tmp = tmp.der;
            } else if (info < tmp.info) {
                tmp = tmp.izq;
            } else {
                Nodo aux = tmp;
                if (tmp.der == null && tmp.izq == null) {
                    if (ant.der == tmp) {
                        ant.der = null;

                    } else {
                        ant.izq = null;
                    }
                } else if (tmp.der != null) {
                    tmp = tmp.der;
                    while (tmp.izq!=null && tmp.izq.izq != null) {
                        tmp = tmp.izq;
                    }
                    if(tmp.izq!=null){
                        aux.info = tmp.izq.info;
                        tmp.izq = null;
                    }
                    else{
                        aux.info = tmp.info;
                        tmp= null;
                    }
                } else {
                    tmp = tmp.izq;
                    while (tmp.der!=null && tmp.der.der != null) {
                        tmp = tmp.der;
                    }
                    if(tmp.izq!=null){
                        aux.info = tmp.der.info;
                        tmp.der = null;
                    }
                    else{
                        aux.info = tmp.info;
                        tmp= null;
                    }                    
                }
                return true;
            }
        }
        return false;
    }

    public boolean eliminarRec(int info) {
        if (buscar(info)) {
            return eliminarRec(info, raiz);
        }
        return false;
    }

    public Nodo reemplazo(Nodo raiz) {
        if (raiz.der != null) {
            return padreSigMayor(raiz.der);
        } else if (raiz.izq != null) {
            return padreSigMenor(raiz.izq);
        }
        return null;        
    }

    public Nodo padreSigMayor(Nodo raiz) {
        if (raiz.izq.izq == null) {
            return raiz;
        } else {
            return padreSigMayor(raiz.izq);
        }
    }

    public Nodo padreSigMenor(Nodo raiz) {
        if (raiz.der.der == null) {
            return raiz;
        } else {
            return padreSigMenor(raiz.der);
        }
    }

    public boolean eliminarRec(int info, Nodo raiz) {
        if (info > raiz.info) {
            return eliminarRec(info, raiz.der);
        } else if (info < raiz.info) {
            return eliminarRec(info, raiz.izq);
        } else {            
            raiz.info=reemplazo(raiz).info;            
        }
        return false;
    }
}



/*
Nodo aux=tmp;                    
                    if(tmp.der==null && tmp.izq==null){
                        
                    }
                    if(tmp.der!=null){
                        tmp=tmp.der;                        
                        while(tmp.izq.izq!=null){
                            tmp=tmp.izq;
                        }
                        aux.info=tmp.izq.info;
                        tmp.izq=null;
                    }else{
                        tmp=tmp.izq;                        
                        while(tmp.der.der!=null){
                            tmp=tmp.der;
                        }
                        aux.info=tmp.der.info;
                        tmp.der=null;
                    }
                    
                    return true;
 */
