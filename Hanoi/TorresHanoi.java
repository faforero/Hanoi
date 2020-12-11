package Hanoi;

import java.util.Scanner;

public class TorresHanoi {

    public static Pila A, B, C;
    public static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        A = new Pila();
        B = new Pila();
        C = new Pila();
        A.apilar(new Nodo(40));
        A.apilar(new Nodo(30));
        A.apilar(new Nodo(20));
        A.apilar(new Nodo(10));               
        do{
            System.out.println("A: " + A + "\nB: " + B + "\nC: " + C);
            mover();
        }while(!A.isVacia() || !B.isVacia());
        System.out.println("A: " + A + "\nB: " + B + "\nC: " + C);
        System.out.println("GANOOOOO");
    }

    public static void mover() {
        System.out.println("Ingrese la pila de Origen <Enter> y luego la de Destino <Enter>");
        char origen = tec.next().charAt(0);
        char destino;
        switch(origen){
            case 'A':
                destino = tec.next().charAt(0);
                switch(destino){
                    case 'B':
                        A.mover(B);
                        break;
                    case 'C':
                        A.mover(C);                        
                        break;                        
                }
                break;
            case 'B':
                destino = tec.next().charAt(0);
                switch(destino){
                    case 'A':
                        B.mover(A);
                        break;
                    case 'C':
                        B.mover(C);
                        break;                        
                }
                break;
            case 'C':
                destino = tec.next().charAt(0);
                switch(destino){
                    case 'A':
                        C.mover(A);
                        break;
                    case 'B':
                        C.mover(B);
                        break;                        
                }
                break;
        }           
    }

}
