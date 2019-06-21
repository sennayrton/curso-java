/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;
import java.util.*;

public class prueba {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombreUsuario=entrada.nextLine();
        System.out.println("Introduce tu edad");
        int edad=entrada.nextInt();
        System.out.println("Hola " + nombreUsuario + " . El año que viene tendrás "+ (edad+1)+ " años. ");
        
        
        
    }
}
