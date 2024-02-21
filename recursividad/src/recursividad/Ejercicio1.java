package recursividad;

import java.util.Scanner;

/**
 * El producto de dos números naturales a y b a través de sumas sucesivas.
 *
 * @author samuel
 */
public class Ejercicio1 {

    static int sumaSucesivas(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return (a + sumaSucesivas(a, b - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el numero b: ");
        int b = sc.nextInt();

        System.out.println("El producto de dos números naturales de " + a + " y " + b + " a  través de sumas sucesivas es " + sumaSucesivas(a, b));
    }
}
