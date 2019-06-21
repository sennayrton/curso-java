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
public class Ej2_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double radio;
        System.out.println("\nIntroduce el radio: ");
        radio = Double.parseDouble(entrada.readLine());
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * (radio * radio);
        System.out.println(area);
        System.out.println(longitud);

    }

}
