/*INFO
- Funcion Math.sqrt() - Hace la raiz cuadrada de un numero o variable
*/
/*
INFO
Con Math.hypot(cateto, cateto); podemos obtener el valor de la hipotenusa en base al valor de sus catetos, sin operaciones adicionales
*/
/* EJERCICIO
Diseñar un programa al que se le introduzca la longitud de dos catetos de un angulo recto y nos devuelva el valor de la hipotenusa. 
Busca en internet como calcular en Java potencias y raíces cuadradas para aplicar el teorema de Pitagoras. 
Investiga tambien si existe en Java alguna utilidad que nos haga este calculo automaticamente. 
*/
package bloque.pkg1;

import java.util.*;

public class ejercicio13 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     double cat1, cat2, hipotenusa;
     System.out.print("Introduce cateto 1: ");
     cat1 = teclado.nextFloat();
        
     System.out.print("Introduce cateto 2: ");
     cat2 = teclado.nextFloat();
     
     
     hipotenusa=Math.pow(cat2, 2)+Math.pow(cat1, 2);
     
     System.out.println("La hipotenusa es: " + Math.sqrt(hipotenusa));
     System.out.println("La hipotenusa es: " + Math.hypot(cat1, cat2));
     }
}
