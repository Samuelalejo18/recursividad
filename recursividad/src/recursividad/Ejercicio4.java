/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 * La siguiente función recursiva permite obtener la división entera de dos
 * números naturales a y b,
 *
 * @author samue
 */
public class Ejercicio4 {

    static int dividir(int a, int b) {

        if (a < b) {
            return 0;
        } else {
            return (1 + dividir(a - b, b));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a : ");
        int a = sc.nextInt();
        System.out.println("Ingrese el numero b : ");
        int b = sc.nextInt();

        System.out.println("la división entera de dos números naturales " + a + " y " + b + " es " + dividir(a, b));
    }
}
