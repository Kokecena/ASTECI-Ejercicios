/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jovan
 */
public class AdivinaNumero {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        boolean adivinado = false;
        int intentos = 5;
        int numeroMagico = rand.nextInt(100) + - 1;
        System.out.println("test: " + numeroMagico);
        for (int i = 0; i < intentos && adivinado == false; i++) {
            System.out.printf("Intento %d, escribe el numero magico: \n", i + 1);
            int numeroIngresado = sc.nextInt();
            if (numeroIngresado > numeroMagico) {
                System.out.println("El numero ingresado es mayor al numero magico\n");
            }
            if (numeroIngresado < numeroMagico) {
                System.out.println("El numero ingresado es menor al numero magico\n");
            }
            if (numeroIngresado == numeroMagico) {
                System.out.println("Acertaste el numero magico :D\nNumero de intentos: " + i);
                adivinado = true;
            }
        }
    }
}
