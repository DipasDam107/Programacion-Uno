/*INFO
	-Funcion Math.round() - Su funcion basica es obtener el redondeo a partir de un numero decimal.
		Asi� mismo, si obtenemos el redondeo del numero multiplicado por 10, 100, 1000... (dependiendo de a que decimal queramos ajustar), para luego dividirlo por ese mismo numero, podemos redondear al decimal deseado
*/
/* EJERCICIO
	Un departamento de climatología ha realizado recientemente su conversión al sistema métrico. Diseñar un algoritmo para realizar las siguientes conversiones: 
	Leer la temperatura dada en la escala Celsius y mostrar su equivalente Fahrenheit (la fórmula de conversión es “F=9/5 ºC+32�?). Resultado redondeado a dos decimales. 
	Leer la cantidad de agua del pluviómetro en pulgadas y mostrar su equivalente en centímetros  (25.5 mm = 1 pulgada). Resultado redondeado a un decimal.
 */
package bloque.pkg1;

import java.util.*;

public class ejercicio6 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     int temperatura, agua; 
     System.out.println("Digame usted la temperatura en Cº: ");
     temperatura= teclado.nextInt();
     
     System.out.println("Digame la cantidad de agua en pulgadas: ");
     agua= teclado.nextInt();
     
     System.out.println(temperatura + "ºC es igual a " + (Math.round((((double)temperatura*9d/5d) + 32d) * 100d) / 100d) + " F"); 
     
     System.out.println(agua + " pulgadas de agua equivalen a " + Math.round(((double)agua*25.5) * 10d) / 10d + " mm");
     }
}

/*importedolares=Math.round(importeeuros*IMPORTECAMBIO*100)/100d; */