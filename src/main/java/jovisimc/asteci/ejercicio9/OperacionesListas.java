/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio9;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jovan
 */
public class OperacionesListas {

    public static void main(String[] args) {
        List<Integer> A = List.of(1, 2, 4, 6, 8, 0, 3, 44, 52, 43, 129);
        List<Integer> B = List.of(23,4,6,2,34,7,99,52,5,8);
        List<Integer> C = A.stream()
                .filter(a ->
                 B.stream().anyMatch(b -> b.intValue() == a.intValue())
                ).collect(Collectors.toList());
        C.forEach(System.out::println);
    }
}
