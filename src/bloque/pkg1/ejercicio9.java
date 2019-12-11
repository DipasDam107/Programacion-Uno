/*EJERCICIO
Indicar el valor de las variables sobre las que se efectuan consecutivamente las operaciones:  
a=3;b=2;  c=a*b-b; a=b-a; z=(b>a)||(a>b); 
  
*/

package bloque.pkg1;

import java.util.*;

public class ejercicio9 {
     public static void main(String [] args){
     Scanner teclado = new Scanner(System.in);
     
     int a=3, b=2,c;
     boolean z;
     
     c=a*b-b;
     System.out.println("OPERACION 1 ");
     System.out.println("a= " +a);
     System.out.println("b= " +b);
     System.out.println("c= " +c);
     
     a=b-a;
     System.out.println("OPERACION 2 ");
     System.out.println("a= " +a);
     System.out.println("b= " +b);
     
     z=(b>a)||(a>b);
     System.out.println("OPERACION 3 ");
     System.out.println("a= " +a);
     System.out.println("b= " +b);
     System.out.println("c= " +c);
     System.out.println("z= " +z);
     
     
     }
}
