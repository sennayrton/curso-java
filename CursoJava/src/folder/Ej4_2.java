/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ej4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int fin;
        fin = 1;
        System.out.println("\nIntroduce un numero mayor o igual a 0: ");
        num = Integer.parseInt(entrada.readLine());
        if (num >= 0){
            for(int i=1;i<=num;i++){
                fin = fin * i;
            }
            System.out.println("El valor total es: "+ fin);
        }else{
            System.out.println("El numero no es mayor o igual que 0: "+ fin);
        }     
            
    }
    
}
