package ejercicioclase8rectangulo;

import java.util.Scanner;

public class EjercicioClase8Rectangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el alto del rectángulo:");
        int alto = scanner.nextInt();

        System.out.println("Digite el ancho del rectángulo:");
        int ancho = scanner.nextInt();

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

    }

}
