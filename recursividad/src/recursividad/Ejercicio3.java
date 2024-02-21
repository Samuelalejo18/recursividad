/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 * La siguiente función recursiva tiene como finalidad calcular la cantidad de
 * cifras de un número natural N leído por el teclado
 *
 * @author samue
 */
public class Ejercicio3 {

    static int CantCifras(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (1 + CantCifras(n / 10));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero n: ");
        int n = sc.nextInt();

        System.out.println("la cantidad de cifras de un número " + n + " es " + CantCifras(n));
    }

}
