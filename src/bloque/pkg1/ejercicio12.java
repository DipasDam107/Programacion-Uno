/*INFO
Evidentemente necesitamos una tercera variable que haga de puente entre valores, ya que si no perderiamos un valor en el procedimiento
*/

/*EJERCICIO
 *El siguiente programa pretende intercambiar dos variables enteras introducidas previamente, y luego mostrarlas por pantalla. Corrige los errores que encuentres en el código
 */
package bloque.pkg1;
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        int var1, var2, intercambio;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
        
        System.out.println("Var1: " + var1);
        System.out.println("Var2: " + var2);
        
        intercambio = var2;
        var2 = var1;
        var1=intercambio;
        
        System.out.println("Var1 vale ahora lo que 2: " + var1);
        System.out.println("Var2 vale ahora lo que 1: " + var2);
}}