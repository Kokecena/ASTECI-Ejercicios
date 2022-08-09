/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author jovan
 */
public class Triangulo {

    public static void main(String[] args) {
        int n = 0;
        int numeroActual = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                ++numeroActual;
                System.out.print(numeroActual + " ");
            }
            System.out.println("");
        }
    }
}
