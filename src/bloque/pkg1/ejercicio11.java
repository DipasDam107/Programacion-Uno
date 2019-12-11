/*EJERCICIO
 * Dise�ar un programa al que se le introduzcan las edades de cuatro personas y nos calcule la media de edad de los mismos. 
 */
 
package bloque.pkg1;
import java.util.*;

public class ejercicio11 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     int edad1, edad2, edad3, edad4 ;
    
     System.out.println("Introduzca edad 1= ");
     edad1=teclado.nextInt();
     
     System.out.println("Introduzca edad 2= ");
     edad2=teclado.nextInt();
     
     System.out.println("Introduzca edad 3= ");
     edad3=teclado.nextInt();
     
     System.out.println("Introduzca edad 4= ");
     edad4=teclado.nextInt();
     
     System.out.println("La media de edades es " + ((float)(edad1+edad2+edad3+edad4)/4f));
     }
}
