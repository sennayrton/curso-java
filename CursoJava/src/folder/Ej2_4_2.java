/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Sergio
 */
public class Ej2_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.println("\nIntroduce el primer entero: ");
        num = Integer.parseInt(entrada.readLine());
        
        if (num % 2 == 0) {
            
            System.out.println("Es par");
                
        } else {
            System.out.println("Es impar");
        }
    }
}
    



 