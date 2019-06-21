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
public class Ej2_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double num1;
        System.out.println("\nIntroduce un numero decimal: ");
        num1 = Double.parseDouble(entrada.readLine());
        int num2 = (int) num1;
        if ((num1 - num2) >= 0.5) {
            num2++;
        }
        System.out.println(num2);

    }
}
