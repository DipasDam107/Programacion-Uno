/*EJERCICIO 2da versión
 Dise�ar un programa al que se le introduzcan las edades de cuatro personas y nos calcule la media de edad de los mismos. Hacer una segunda version que solo utilice dos variables
 */
package bloque.pkg1;

import java.util.*;

public class ejercicio11dos {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     int edad=0 ;
    
     System.out.println("Introduzca edad 1= ");
     edad=edad+teclado.nextInt();
     
     System.out.println("Introduzca edad 2= ");
     edad=edad+teclado.nextInt();
     
     System.out.println("Introduzca edad 3= ");
     edad=edad+teclado.nextInt();
     
     System.out.println("Introduzca edad 4= ");
     edad=edad+teclado.nextInt();
     
     System.out.println("La media de edades es " + ((float)edad/4f));
     }
}
