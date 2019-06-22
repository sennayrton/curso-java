/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;
import java.util.Scanner;

public class notasalumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alum;
        double nota, suma = 0, mayor, menor;;
       
        System.out.println("Nota media, mayor y menor en una clase");

        do {
            System.out.print("Introduce numero de alumnos: ");
            alum = sc.nextInt();  
        } while (alum <= 0); 

        System.out.print("Nota del alumno 1: ");
        nota = sc.nextDouble();
        suma = suma + nota;
        mayor = nota; 
        menor = nota;
       
        for (int i = 2; i <= alum; i++) {  
            System.out.print("Nota del alumno " + i + ": ");
            nota = sc.nextDouble();
            suma = suma + nota; 
            if (nota > mayor){  
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }

        System.out.printf("La nota media ha sido: %.2f %n" , suma/alum);
        System.out.println("La nota más alta ha sido " + mayor);
        System.out.println("La nota más baja ha sido " + menor);
    }
   
}
