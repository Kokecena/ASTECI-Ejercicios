/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jovisimc.asteci.ejercicio10;

/**
 *
 * @author jovan
 */
public class OperacionMatrices {

    public static void main(String[] args) {
        int a[][] = {{2, 0, 1},
        {3, 0, 0},
        {5, 1, 1}};
        int b[][] = {{1, 0, 1},
        {1, 2, 1},
        {1, 1, 0}};
        int ab[][] = new int[3][3];
        
        //Operacion
        for (int fila = 0; fila < a.length; fila++) {
            for (int col = 0; col < b[0].length; col++) {
                for (int pos = 0; pos < a.length; pos++) {
                    ab[fila][col] += a[fila][pos] * b[pos][col];
                }
            }
        }
        //Impresión
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab[0].length; j++) {
                System.out.print(ab[i][j]);
            }
            System.out.println("");
        }
    }
}
