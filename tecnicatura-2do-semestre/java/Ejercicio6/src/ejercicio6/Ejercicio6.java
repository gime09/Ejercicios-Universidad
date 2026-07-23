
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Pedir la cantidad de dinero que tiene Guillermo
        System.out.println("Ingrese la cantidad de dinero que tiene Guillermo: ");
        double dineroGuillermo = scanner.nextDouble();
        
        // Calcular el dinero que tienen Luis y Juan
        double dineroLuis = dineroGuillermo / 2;
        double dineroJuan = (dineroGuillermo + dineroLuis) / 2;
        
        // Calcular la cantidad total de dinero
        double totalDinero = dineroGuillermo + dineroLuis + dineroJuan;
        
        // Imprimir la cantidad total de dinero
        System.out.println("La cantidad total de dinero entre los tres (Guillermo, Luis y Juan ) es $ : " + totalDinero);
        
        scanner.close();
        
        
        
        
        
    }
    
}
