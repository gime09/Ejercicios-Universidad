/*
Ejercicio 11: Diseñar un programa que muestre el producto de los 10 
primeros números impares
Hacerlo con JOptionPane
*/


package ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {
    public static void main(String[] args) {
        long producto = 1;
        // Ciclo que recorre los 10 primeros números impares
        for (int i = 1; i <= 19; i += 2) { // Solo hasta 19 para tener los primeros 10 impares
            producto *= i;
        }
        // Muestra el producto de los 10 primeros números impares
        JOptionPane.showMessageDialog(null, "El producto de los 10 primeros números impares es: " + producto);
    }
}
