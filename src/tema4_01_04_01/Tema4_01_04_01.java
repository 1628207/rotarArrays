package tema4_01_04_01;

import java.util.Scanner;

/**
 * 
 * @author Carmelo
 */

public class Tema4_01_04_01 {

 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroCasos = 0;
        int tamanyoArray = 0;
        int posicionesQueRotar = 0;

        String direccionRotacion = "";

        numeroCasos = sc.nextInt();
        for (int i = 0; i < numeroCasos; i++) {
            tamanyoArray = sc.nextInt();

            int[] array1 = new int[tamanyoArray];

            for (int j = 0; j < array1.length; j++) {
                array1[j] = sc.nextInt();
            }

            posicionesQueRotar = sc.nextInt();
            direccionRotacion = sc.nextLine();

            try {

                if (direccionRotacion.equals(" D")) {
                    rotarDerechaN(array1, posicionesQueRotar);
                } else {
                    rotarIzquierdaN(array1, posicionesQueRotar);
                }

                for (int j = 0; j < array1.length; j++) {

                    System.out.print(array1[j] + " ");

                }
                System.out.println();

            } catch (IllegalArgumentException ex1) {
                System.out.println("Las posiciones a rotar deben ser un numero positivo. No se ha rotado el array");
                for (int j = 0; j < array1.length; j++) {

                    System.out.print(array1[j] + " ");

                }
                System.out.println();

            }
        }
    }

    /**
     * Recibe un array y rota N posiciones a la derecha.
     *
     * @param array - El array que se quiere rotar.
     * @param numPosiciones - El numero de posiciones que se van a rotar.
     */
    public static void rotarDerechaN(int[] array, int numPosiciones) {
        int ultimaPosicion = 0;
        int contador = numPosiciones;
        if (contador < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < contador; i++) {
            ultimaPosicion = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = ultimaPosicion;

        }

    }

    /**
     * Recibe un array y rota N posiciones a la izquierda.
     *
     * @param array - El array que se quiere rotar.
     * @param numPosiciones - El numero de posiciones que se van a rotar.
     * 
     */
    public static void rotarIzquierdaN(int[] array, int numPosiciones) {
        int primeraPosicion = 0;
        int contador = numPosiciones;

        if (contador < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < contador; i++) {

            primeraPosicion = array[0];
            for (int j = 1; j < array.length; j++) {
                array[j - 1] = array[j];
            }
            array[array.length - 1] = primeraPosicion;
        }

    }

}
