
package clase12_ej2;

import java.util.Scanner;


public class Clase12_ej2 {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar el valor de a y b al usuario
        System.out.print("Ingresa el valor de a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Ingresa el valor de b: ");
        double b = scanner.nextDouble();

        // Calcular el cuadrado de la suma
        double aCuadrado = Math.pow(a, 2);
        double bCuadrado = Math.pow(b, 2);
        double dosAB = 2 * a * b;
        double resultado = aCuadrado + bCuadrado + dosAB;

        // Mostrar el resultado
        System.out.println("El cuadrado de la suma de " + a + " y " + b + " es: " + resultado);

        scanner.close();
        
    }
    
}
