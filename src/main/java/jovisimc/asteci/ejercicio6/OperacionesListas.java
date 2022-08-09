/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio6;

import java.util.List;

/**
 *
 * @author jovan
 */
public class OperacionesListas {
    public static void main(String[] args) {
        List<String> paises = List.of("Rusia", "Estados Unidos","Brasil","Canada","México");
        List<String> filtroDePaises = paises.stream()
                .filter(pais -> pais.substring(pais.length()-1, pais.length()).matches("[a|e|i|o|u]"))
                .map(String::toUpperCase)
                .toList();
        filtroDePaises.forEach(System.out::println);
                
    }
}
