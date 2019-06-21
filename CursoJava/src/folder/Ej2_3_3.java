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
public class Ej2_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double x1;
        System.out.println("\nIntroduce x1: ");
        x1 = Double.parseDouble(entrada.readLine());
        double x2;
        System.out.println("\nIntroduce x2: ");
        x2 = Double.parseDouble(entrada.readLine());
        double y1;
        System.out.println("\nIntroduce y1: ");
        y1 = Double.parseDouble(entrada.readLine());
        double y2;
        System.out.println("\nIntroduce y2: ");
        y2 = Double.parseDouble(entrada.readLine());
        double p = (y2-y1) / (x2-x1);
        System.out.println(p);
      

    }

}