/* INFO
 * - Las variables final son constantes que no van a cambiar en todo el programa. Util declararlas al inicio en caso de que puedan actualizarse periodicamente (Impuestos, valor de moneda...)
 * - Podemos forzar que se trate una cifra como double o float poniendo una d o f al final respectivamente. Si ponemos decimales lo tratara como tal, evidentemente
 */
 
/* EJERCICIO
 * Realiza un programa que lea por consola un valor en dólares y lo convierta a euros (suponer que 1 euro es igual a=1,14 dólares). 
 */
package bloque.pkg1;

import java.util.*;

/**
 *
 * @author dam107
 */
public class ejercicio2 {
    public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);
       float dinerito,descuento;
       //constante de tipo de cambio
       final float cambio=14;
       
       System.out.println("Introduzca cantidad en dolares: ");
       dinerito = teclado.nextFloat();
       System.out.println("La canitdad en euros es: " + (dinerito - ((dinerito*cambio)/100f)));
    }
}
/*importedolares=Math.round(importeeuros*IMPORTECAMBIO*100d)/100d; */
/*final double tipocambio; Para constantes*/