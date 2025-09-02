/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Repositorio;

import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class Repositorio {

    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es POSITIVO.");
        } else if (numero < 0) {
            System.out.println("El número es NEGATIVO.");
        } else {
            System.out.println("El número es CERO.");
        }

        sc.close();
    }
}
    




