import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario las horas trabajadas
        System.out.print("Introduce las horas trabajadas en la semana: ");
        double horasTrabajadas = scanner.nextDouble();
        
        // Solicitar al usuario el salario por hora
        System.out.print("Introduce el salario por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
        // Calcular el salario
        double salarioSemanal = calcularSalario(horasTrabajadas, salarioPorHora);
        
        // Imprimir el salario
        System.out.println("El salario semanal del empleado es: " + salarioSemanal);
        
        // Cerrar el scanner
        scanner.close();
    }
    
    // Método para calcular el salario
    public static double calcularSalario(double horasTrabajadas, double salarioPorHora) {
        return horasTrabajadas * salarioPorHora;
    }
}

    

