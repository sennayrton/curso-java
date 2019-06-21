/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;


public class cadenas {
    public static void main(String[] args) {
        String nombre="Juan";
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
        int ultimaLetra;
        ultimaLetra=nombre.length();
        System.out.println("Y la última letra es la " + nombre.charAt(ultimaLetra-1));
        
    }
    
}   