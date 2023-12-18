package daw;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author acebedo
 */
public class Ej1 {

    public static void main(String[] args) {
        // Inicializo TAMAÑO.
        final int TAMANO = 15;

        // Crear un array con el tamaño adecuado.
        double[] miarray = new double[TAMANO];

        // Relleno todas las posiciones con 7.5
        for (int i = 0; i < miarray.length; i++) {
            miarray[i] = 7.5;
        }

        // Crear un array copia.
        double[] miarraycopia = miarray.clone();

        System.out.println("----------------");
        System.out.println("Miarray: " + Arrays.toString(miarray) + ".");
        System.out.println("----------------");
        System.out.println("MiarrayCopia: " + Arrays.toString(miarraycopia) + ".");
        System.out.println("----------------");

        if (Arrays.equals(miarray, miarraycopia)) {
            System.out.println("Ambos arrays son iguales.");
        } else {
            System.out.println("Ambos arrays son diferentes.");
        }

        System.out.println("----------------");

        // Cambiar un valor en una posición aleatoria de miarray.
        Random random = new Random();
        int posicion = random.nextInt(TAMANO);
        miarray[posicion] = 6.3;

        System.out.println("----------------");
        System.out.println("Miarray: " + Arrays.toString(miarray) + ".");
        System.out.println("----------------");
        System.out.println("MiarrayCopia: " + Arrays.toString(miarraycopia) + ".");
        System.out.println("----------------");

        if (Arrays.equals(miarray, miarraycopia)) {
            System.out.println("Ambos arrays son iguales.");
        } else {
            System.out.println("Ambos arrays son diferentes.");
        }
    }
}
