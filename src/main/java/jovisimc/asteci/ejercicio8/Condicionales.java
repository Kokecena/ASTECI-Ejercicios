/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author jovan
 */
public class Condicionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextInt();
        System.out.println("Ingrese el valor de c: ");
        c = sc.nextInt();
        if (a > b && b > c) {
            System.out.println(a + "," + b + "," + c);
        }
        if (a > c && c > b) {
            System.out.println(a + "," + c + "," + b);
        }
        if (b > a && a > c) {
            System.out.println(b + "," + a + "," + c);
        }
        if (b > c && c > a) {
            System.out.println(b + "," + c + "," + a);
        }
        if (c > a && a > b) {
            System.out.println(c + "," + a + "," + b);
        }
        if (c > b && b > a) {
            System.out.println(c + "," + b + "," + a);
        }
    }
}
