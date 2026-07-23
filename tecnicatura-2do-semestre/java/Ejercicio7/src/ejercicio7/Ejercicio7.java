
package ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        
     final double SALARIO_BASE = 1000;
        final double COMISION_POR_CARRO = 150;
        final double PORCENTAJE_VENTA = 0.05;
        
        Scanner scanner = new Scanner(System.in);
           
        
         // Pedir la cantidad de carros vendidos y el valor total de las ventas
        System.out.println("Ingrese la cantidad de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();
        
        System.out.println("Ingrese el valor total de las ventas: ");
        double valorVentas = scanner.nextDouble();
        
        // Calcular el salario mensual
        double salarioMensual = SALARIO_BASE + (COMISION_POR_CARRO * carrosVendidos) + (PORCENTAJE_VENTA * valorVentas);
        
        // Imprimir el salario mensual
        System.out.println("El salario mensual del vendedor es  $ : " + salarioMensual);
        
        scanner.close();
        
        
        
        
        
    }
    
}
