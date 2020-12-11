package parcialfabianforero;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class ParcialFabianForero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Cola texto = new Cola();

        System.out.print(" = DIGITE EL TEXTO DESEADO = \n");
        System.out.print("");
        String var = tec.nextLine();
        String origen;

        texto.insertar(new Nodocola(var));
        System.out.println(texto);

    }

}
