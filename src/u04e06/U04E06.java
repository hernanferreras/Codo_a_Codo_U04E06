
package u04e06;

import java.util.Scanner;
public class U04E06 {
    public static void main(String args[]) {
      Scanner entrada = new Scanner (System.in);
      double lado1, lado2, hipotenusa, perimetro, superficie;
      System.out.print("Ingrese un lado del triangulo: ");
      lado1=entrada.nextDouble();
      System.out.print("Ingrese otro lado del triangulo: ");
      lado2=entrada.nextDouble();
      hipotenusa = Math.sqrt((Math.pow(lado1,2))+(Math.pow(lado2,2)));
      perimetro = (float)lado1+lado2+hipotenusa;
      superficie = (float)(lado1*lado2/2);
      System.out.println("El perimetro del triangulo es: "+perimetro);
      System.out.println("La superficie del triangulo es: "+superficie);
    }
}