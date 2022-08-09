/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio2;

import java.util.List;

/**
 *
 * @author jovan
 */
public class CrearLista {

    public static void main(String[] args) {
        List<String> nombres = List.of("juan", "pedro", "jose", "maria", "sofia");
        nombres.stream()
                .map(nombre -> nombre.substring(0, 1).toUpperCase() + nombre.substring(1))
                .forEach(System.out::println);
    }
}
