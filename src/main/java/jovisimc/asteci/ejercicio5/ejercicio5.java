/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio5;

import java.util.List;

/**
 *
 * @author jovan
 */
public class ejercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,8,5,2,33,54,22,6,88,13);
        numeros.stream()
                .filter(numero -> numero % 2 ==0)
                .forEach(numero -> System.out.println(numero));
    }
}
