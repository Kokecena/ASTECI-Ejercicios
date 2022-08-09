/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio1;

/**
 *
 * @author jovan
 */
public class Main {
    public static void main(String[] args) {
        Forma forma = new Rectangulo();
        forma.calculaArea();
        ((Rectangulo)forma).calcularArea(5, 10);
    }
}
