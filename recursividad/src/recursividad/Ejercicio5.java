/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 * Imprimir los números desde N hasta 1.
 *
 * @author samuel
 */
public class Ejercicio5 {

    static void numerosHastaN(int n) {
        if (n > 0) {
            numerosHastaN(n - 1);
        }
        System.out.println(n);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero n: ");
        int n = sc.nextInt();

        numerosHastaN(n);

    }
}
