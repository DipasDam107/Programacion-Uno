/*EJERCICIO
Queremos realizar un peque�o programa para introducirlo en el ordenador de a bordo de nuestro coche 
y que nos informe del consumo medio del coche cada 100 km. Dise�a un algoritmo que lea el kilometraje de la ultima vez que se reposto, 
el kilometraje actual, los litros de gasolina que tenia al finalizar la ultima vez que reposto y la cantidad de gasolina actual. 
*/
package bloque.pkg1;

import java.util.*;

public class ejercicio10 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     float kmRepostaje, kmActual, liRepostaje, gasActual;
     System.out.println("Kilometraje Al repostar: ");
     kmRepostaje=teclado.nextInt();
     
     System.out.println("Kilometraje Actual: ");
     kmActual=teclado.nextInt();
     
     System.out.println("Litros de Gasolina al respostar: ");
     liRepostaje=teclado.nextInt();
     
     System.out.println("Gasolina Actual: ");
     gasActual=teclado.nextInt();
     
     System.out.println("Has recorrido " +(kmActual - kmRepostaje) + "km");
     System.out.println("Has gastado " +(liRepostaje - gasActual) + " Litros");
     
     System.out.println("Usas " + ((((liRepostaje - gasActual))/((kmActual - kmRepostaje)))*100f) + " cada 100 KM");
    
     }
}
