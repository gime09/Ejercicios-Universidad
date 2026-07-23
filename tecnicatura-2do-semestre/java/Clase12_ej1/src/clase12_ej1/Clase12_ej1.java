
package clase12_ej1;

import java.util.Scanner;


public class Clase12_ej1 {

   
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        // Solicitar el número total de horas al usuario
        System.out.print("Ingresa el número total de horas: ");
        int totalHoras = scanner.nextInt();

        // Calcular el número de semanas
        int semanas = totalHoras / (7 * 24);
        // Calcular el resto de horas después de obtener las semanas
        int restoHoras = totalHoras % (7 * 24);

        // Calcular el número de días a partir del resto de horas
        int dias = restoHoras / 24;
        // Calcular el resto de horas después de obtener los días
        int horas = restoHoras % 24;

        // Mostrar los resultados
        System.out.println(totalHoras + " horas equivalen a:");
        System.out.println(semanas + " semanas");
        System.out.println(dias + " días");
        System.out.println(horas + " horas");

        scanner.close();
    }
        
        
        
        
    }
    

