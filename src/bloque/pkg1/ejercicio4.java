/*
INFO

Casting: Podemos forzar el cambio de un tipo de dato a otro usando el casting antes la variable cuyo tipo queramos cambiar
 EJ: (double)numero1
Esto es especialmente util cuando de una operacion nos interesa tener un tipo de dato distinto al de los operandos
*/

/*
EJERCICIO
Realiza un programa que lea dos números enteros (sin decimales) y nos muestre los resultados de sumar, 
restar y dividir dichos números dichos números. Comprueba que la división responde con decimales y también prueba a introducir cero como segundo número
 */

package bloque.pkg1;

import java.util.*;

public class ejercicio4 {
     public static void main(String [] args){
         int numero1, numero2;
        
         Scanner teclado = new Scanner(System.in);
         System.out.println("Introduzca numero1: ");
         numero1=teclado.nextInt();
         System.out.println("Introduzca numero2: ");
         numero2=teclado.nextInt();
         
         System.out.println("La suma da: " + (numero1+numero2));
         System.out.println("La resta da: " + (numero1-numero2));
         
		 //el double genera que la operacion se comporte como decimal
         System.out.println("La division da: " +(double)numero1/numero2);
         System.out.println("La multiplicacion da: " + (numero1*numero2));
      
     }
}
