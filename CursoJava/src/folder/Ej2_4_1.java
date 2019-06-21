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
public class Ej2_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int num1;
        System.out.println("\nIntroduce el primer entero: ");
        num1 = Integer.parseInt(entrada.readLine());
        int num2;
        System.out.println("\nIntroduce el segundo entero: ");
        num2 = Integer.parseInt(entrada.readLine());
        if (num1 > num2) 
            System.out.println("Mayor:"+num1+", Menor:"+num2);
        else if (num1 < num2)
            System.out.println("Mayor:"+num2+", Menor:"+num1);
        else
            System.out.println(num1+" es igual que "+num2);
       
}

}
