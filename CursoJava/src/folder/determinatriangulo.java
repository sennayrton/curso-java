/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;
import java.io.*;
import java.util.Scanner;
public class determinatriangulo {
  
   public static void main(String[] args) {
      
       Scanner lector = new Scanner(System.in);
       double l1,l2,l3;
       System.out.print("Introduce el Valor del 1 Lado:");
       l1 = lector.nextDouble();
       System.out.print("Introduzca el Valor del 2 Lado:");
       l2 = lector.nextDouble();
       System.out.print("Introduzca el Valor del 3 Lado:");
       l3 = lector.nextDouble();
       if (l1==l2 && l2==l3)
               System.out.println("\nEl Triangulo es equilatero\n");
               else
               {
                       if (l1==l2 || l1==l3 || l2==l3)
                               System.out.println("\nEl Triangulo es isósceles");
                               else
                               {
                                       if (l1!=l2 || l1!=l3 || l3!=l2)
                                               System.out.println("\nEl Triangulo es escaleno");
                               }
               }
   }
  
}