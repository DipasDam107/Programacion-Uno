/*
El coste de un automovil nuevo para un comprador es la suma total del coste del vehi�culo, del porcentaje de la ganancia del vendedor que se aplica sobre ese coste 
y de los impuestos locales o estatales aplicables (sobre el precio de venta final). 
	Suponer una ganancia del vendedor del 12% en todas las unidades y un impuesto del 6% y realizar un programa que lea el coste inicial del automovil y calcule el coste para el consumidor, 
	con el mi�nimo numero de operaciones
*/
package bloque.pkg1;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double costeInicial, vendedor, impuesto;
        final double impVendedor=12, impEstado=6;
        
        System.out.println("Introduce el coste inicial del coche: ");
        costeInicial=teclado.nextDouble();
        
        vendedor=(costeInicial*impVendedor)/100d;
        impuesto=(costeInicial*impEstado)/100d;
        
        vendedor=Math.round(vendedor * 100d)/100d;
        impuesto=Math.round(impuesto*100d)/100d;
        
        System.out.println("La parte del vendedor es: " + vendedor);
        System.out.println("Los impuestos a sumar son: " + impuesto);
        System.out.println("El coste final es: " + (Math.round((costeInicial + vendedor + impuesto) * 100d)/100d));
        
        
    }
}
