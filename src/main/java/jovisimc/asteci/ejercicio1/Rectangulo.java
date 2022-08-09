/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio1;

/**
 *
 * @author jovan
 */
public class Rectangulo implements Forma {

    private int Area;
    
    @Override
    public void calculaArea() {
        Area = 3 * 2;
        System.out.println("El area es: " + Area);
    }
    
    public void calcularArea(int base, int altura){
        Area = base * altura;
        System.out.println("El area es: " + Area);
    }
    
}
