package parcialfabianforero;

/**
 *
 * @author estudiante
 */
public class Arbol {

    Nodo raiz;

    Arbol() {
        raiz = null;
    }

    public boolean isVacio() {
        return (raiz == null);
    }

    public boolean insertar(int info) {
        Arbol copia=new Arbol();
        if (isVacio()) {
            raiz = new Nodo(info);
            return true;
        } else {          
            return insertar(new Nodo(info), raiz);
        }
    }

    public void limpiar(Arbol x) {
        x.raiz = null;
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
                    while (tmp.izq != null && tmp.izq.izq != null) {
                        tmp = tmp.izq;
                    }
                    if (tmp.izq != null) {
                        aux.info = tmp.izq.info;
                        tmp.izq = null;
                    } else {
                        aux.info = tmp.info;
                        tmp = null;
                    }
                } else {
                    tmp = tmp.izq;
                    while (tmp.der != null && tmp.der.der != null) {
                        tmp = tmp.der;
                    }
                    if (tmp.izq != null) {
                        aux.info = tmp.der.info;
                        tmp.der = null;
                    } else {
                        aux.info = tmp.info;
                        tmp = null;
                    }
                }
                return true;
            }
        }
        return false;
    }

}
