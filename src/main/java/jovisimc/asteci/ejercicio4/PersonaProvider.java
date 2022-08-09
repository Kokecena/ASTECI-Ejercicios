/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jovisimc.asteci.ejercicio4;

/**
 *
 * @author jovan
 */
public interface PersonaProvider {
    
    void calcularTiempoVivido(String nombre, int edad);
    
    default void getName(String name){
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
