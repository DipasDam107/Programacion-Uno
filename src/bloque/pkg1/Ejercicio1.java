/*

INFO
----------------------------------------------------
-Import nos permite cargar librerías con funciones utiles para nuestro algoritmo. En este caso necesitamos Scanner.
Se podría importar:
	import java.util.Scanner; o
	import java.util.*; si queremos la libreria util entera (Supongo que a niveles de utilizacion de recursos no es recomendable,
	
- Para declarar una variable ponemos tipoVAriable NombreVariable. Algunos tipos de variable son:
	int
	long
	bit
	byte
	
	DECIMALES
	double
	float
	
	BOOLEANO
	boolean
	
	Cadenas y caracter
	char
	string

-System.out.println imprimer cadenas en pantalla. Con + concatenamos otras cadenas e incluso variables del tipo que sean u operaciones

-Scanner es una funcion que nos permite pedir datos al usuario. Creamos una instancia de la misma llamada teclado y con la funcion nextTipodato() 
transformamos el input del usuario al tipo deseado (Ojo a la compatibilidad)
*/

/*EJERCICIO
------------------------------
Realiza un programa que lea por consola un valor en euros y lo convierta a dólares (suponer que 1 euro es igual a 1,14 dólares). */

package bloque.pkg1;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       float dinerito;
       
       System.out.println("Introduzca cantidad en euros: ");
       dinerito = teclado.nextFloat();
       
       System.out.println("La canitdad en dolares es: " + dinerito*1.14);
    }
    
}
