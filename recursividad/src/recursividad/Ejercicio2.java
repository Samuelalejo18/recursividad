/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author samue
 */
import java.util.Scanner;

/**
 * La siguiente función recursiva tiene como finalidad calcular b^x. mediante
 * multiplicaciones sucesivas, siendo b y x dos números naturales. 
 *
 * @author samuel
 */
public class Ejercicio2 {

    static int Potencia(int b, int x) {
        if (x == 0) {
            return 1;
        } else {
            return (b * Potencia(b, x - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero b ( base ) : ");
        int b = sc.nextInt();
        System.out.println("Ingrese el numero x ( exponente ) : ");
        int x = sc.nextInt();

        System.out.println("El resultado de la pontecia de " + b + " elvado a " + x + " a  través de multiplicaciones sucesivas es " + Potencia(b, x));
    }

}
