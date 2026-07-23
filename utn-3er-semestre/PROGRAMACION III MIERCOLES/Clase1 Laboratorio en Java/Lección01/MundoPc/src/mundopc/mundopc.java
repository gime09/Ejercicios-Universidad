
package mundopc;
import ar.com.system2023.mundopc.*;
public class mundopc {
    
    public static void main(String[] args) {
       Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
       Teclado tecladoHP = new Teclado("Bluetooth", "HP");
       Raton ratonHP = new Raton("Bluetooth", "HP");  
       Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
       
       //Creamos otros objetos diferentes
       Monitor monitorGamer = new Monitor("Gamer", 32); 
       Teclado tecladoGamer = new Teclado("Gamer", "HP");
       Raton ratonGamer = new Raton("Bluetooth", "Gamer");  
       Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
       Orden orden1 = new Orden(); //inicializamos el arreglo
       Orden orden2 = new Orden();// Una nueva lista para el objeto orden2
       orden1.agregarComputadora(computadoraHP);
       orden1.agregarComputadora(computadoraGamer);
       orden1.mostrarOrden();
       
       Computadora computadorasVarias = new Computadora("Computadoras de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
       orden2.agregarComputadora(computadorasVarias);
       orden2.mostrarOrden();
        
        //Crear más objetos de tipo computadora con todos sus elementos
        //Completar una lista en el objeto  orden1 que llegue a los 10 elementos 
        //probar  de este manera los métodos al maximo rendimiento
        
        
       // === ORDEN 3 COMPLETA ===
Orden orden3 = new Orden();

Computadora c1 = new Computadora("Razer Blade", new Monitor("Razer", 15), new Teclado("Bluetooth", "Razer"), new Raton("Bluetooth", "Razer"));
Computadora c2 = new Computadora("MSI Stealth", new Monitor("MSI", 17), new Teclado("USB", "MSI"), new Raton("USB", "MSI"));
Computadora c3 = new Computadora("Huawei MateBook", new Monitor("Huawei", 14), new Teclado("Bluetooth", "Huawei"), new Raton("USB", "Huawei"));
Computadora c4 = new Computadora("Toshiba Satellite", new Monitor("Toshiba", 15), new Teclado("USB", "Toshiba"), new Raton("USB", "Toshiba"));
Computadora c5 = new Computadora("VAIO Classic", new Monitor("VAIO", 13), new Teclado("Bluetooth", "VAIO"), new Raton("Bluetooth", "VAIO"));
Computadora c6 = new Computadora("LG Gram", new Monitor("LG", 16), new Teclado("Bluetooth", "LG"), new Raton("USB", "LG"));
Computadora c7 = new Computadora("Microsoft Surface", new Monitor("Microsoft", 13), new Teclado("Bluetooth", "Microsoft"), new Raton("Bluetooth", "Microsoft"));
Computadora c8 = new Computadora("Google Pixelbook", new Monitor("Google", 12), new Teclado("USB", "Google"), new Raton("USB", "Google"));
Computadora c9 = new Computadora("Xiaomi Mi Notebook", new Monitor("Xiaomi", 15), new Teclado("Bluetooth", "Xiaomi"), new Raton("Bluetooth", "Xiaomi"));
Computadora c10 = new Computadora("Gateway Ultra", new Monitor("Gateway", 14), new Teclado("USB", "Gateway"), new Raton("USB", "Gateway"));

// Agregamos las 10 computadoras a orden3
orden3.agregarComputadora(c1);
orden3.agregarComputadora(c2);
orden3.agregarComputadora(c3);
orden3.agregarComputadora(c4);
orden3.agregarComputadora(c5);
orden3.agregarComputadora(c6);
orden3.agregarComputadora(c7);
orden3.agregarComputadora(c8);
orden3.agregarComputadora(c9);
orden3.agregarComputadora(c10);

// Mostrar orden3
System.out.println("\n=== ORDEN 3 ===");
orden3.mostrarOrden();

        
    }
    
}
