/*EJERCICIO

 Queremos conocer los datos estadísticos de una asignatura, por lo tanto, necesitamos un programa que lea el número de suspensos, suficientes, notables y sobresalientes de una asignatura, y nos calcule: 
 El tanto por ciento de alumnos que han superado la asignatura. 
 El tanto por ciento de notables y sobresalientes de la asignatura. 
 */
package bloque.pkg1;

import java.util.*;

public class ejercicio5 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     int alumnos, suficientes, notables, sobresalientes, suspensos;
     
    
     System.out.println("Introduzca suspensos: ");
     suspensos=teclado.nextInt();
     
     System.out.println("Introduzca suficientes: ");
     suficientes=teclado.nextInt();
     
     System.out.println("Introduzca sobresalientes: ");
     sobresalientes=teclado.nextInt();
     
     System.out.println("Introduzca notables: ");
     notables=teclado.nextInt();
     
     alumnos=suspensos+suficientes+sobresalientes+notables;
      
     
     System.out.println("Ha Suspendido el: " +((suspensos*100)/alumnos) +"%");
     System.out.println("Ha sacado suficiente el: " + ((suficientes*100)/alumnos)+"%");
     System.out.println("Ha sacado notable el: " +((notables*100)/alumnos) +"%");
     System.out.println("Ha sacado sobresaliente el: " +((sobresalientes*100)/alumnos) +"%");

     }
}
