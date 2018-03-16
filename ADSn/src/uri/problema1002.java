/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;
import java.util.Scanner;
public class problema1002 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double raio = teclado.nextDouble();
        double resultado = 3.14159 * Math.pow(raio, 2); 
        System.out.printf("A=%.4f\n", resultado);
            }
    
}

