package preParcial;

public class PreParcial {

    public static void main(String[] args) {
        int x[] = new int[10];
        int y[] = new int[10];
        int z[] = new int[10];

        for (int i = 0; i < x.length; i++) {
            z[i] = y[i] = x[i] = (int) (Math.random() * 10);
        }
        ordenar(true,y);
        ordenar(false,z);
        mostrar(x);
        System.out.println("");
        mostrar(y);
        System.out.println("");
        mostrar(z);
        Lista m = new Lista();
        for (int i = 0; i < x.length; i++) {
            m.insertarCab(new Nodo(y[i] * z[i]));
        }
        System.out.println("\nLISTA");
        System.out.println(m);
        int mayor = m.mayor();
        System.out.println("Mayor-> " + mayor + " Pos= " + m.buscar(mayor));
        int menor = m.menor();
        System.out.println("Menor-> " + menor + " Pos= " + m.buscar(menor));
        System.out.println("\nLISTA DE PARES\n"+m.filtrarPar());
    }

    public static void mostrar(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public static void ordenar(boolean asc, int y[]) {
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (asc) {
                    if (y[i] < y[j]) {
                        int aux = y[j];
                        y[j] = y[i];
                        y[i] = aux;
                    }
                } else {
                    if (y[i] > y[j]) {
                        int aux = y[j];
                        y[j] = y[i];
                        y[i] = aux;
                    }
                }
            }
        }
    }
}

