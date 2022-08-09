/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio4;


/**
 *
 * @author jovan
 */
public class InterfazPrueba {

    public static void main(String[] args) {
        PersonaProvider pp = (String nombre, int edad) -> {
            int dias = edad * 365;
            int meses = edad * 12;
            int horas = edad * 8760;
            System.out.println("Hola " + nombre + 
                    " has vivido: dias " + dias 
                    + ", meses " + meses
                    + ", horas " + horas);
        };
        pp.calcularTiempoVivido("Jovanni",22);
        pp.getName("Jovanni");
    }

}
