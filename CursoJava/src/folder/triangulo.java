/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sergio
 */
public class triangulo {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	boolean l1, l2, l3;
 
	System.out.println("Escriba el lado 1: ");
	l1 = leer.nextBoolean();
 
	System.out.println("Escriba el lado 2: ");
	l2 = leer.nextBoolean();
 
	System.out.println("Escriba el lado 3: ");
	l3 = leer.nextBoolean();
 
	if(l1==l2==l3)
            {
		System.out.println("Triangulo Equilatero");
		}else	{
			if((l1==l2!=l3) || (l1==l3!=l2) || (l2==l3!=l1))
			{
			System.out.println("Triangulo Isoseles");
			}else{
			System.out.println("Triangulo Escaleno");
								}
					}
	}
}