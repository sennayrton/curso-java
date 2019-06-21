/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej4_3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	double l1, l2, l3;
 
	System.out.println("Escriba el lado 1: ");
	l1 = Double.parseDouble(entrada.readLine());
 
	System.out.println("Escriba el lado 2: ");
	l2 = Double.parseDouble(entrada.readLine());
 
	System.out.println("Escriba el lado 3: ");
	l3 = Double.parseDouble(entrada.readLine());
 
	if (l1==l2 && l2==l3)
               System.out.println("\nEl Triangulo es Equilatero\n");
               else
               {
                       if (l1==l2 || l1==l3 || l2==l3)
                               System.out.println("\nEl Triangulo es Isosceles");
                               else
                               {
                                       if (l1!=l2 || l1!=l3 || l3!=l2)
                                               System.out.println("\nEl Triangulo es Escaleno");
                               }
               }
   }
  
}
