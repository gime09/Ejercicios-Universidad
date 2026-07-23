
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.Orden;
import ar.com.codesystem.ventas.Producto;


public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 2990.00);
        Producto producto3 = new Producto("Camisa", 1200.00);
        Producto producto4 = new Producto("Zapatos", 8000.00);
        Producto producto5 = new Producto("Cinturon", 500.00);
        Producto producto6 = new Producto("Gorra", 700.00);
        Producto producto7 = new Producto("Bufanda", 850.00);
        Producto producto8 = new Producto("Reloj", 15000.00);
        Producto producto9 = new Producto("Calcetines", 200.00);
        Producto producto10 = new Producto("Chaleco", 4000.00);
        
        Orden orden1 = new Orden();
        //Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        // Crear la segunda orden y agregar otros productos
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.mostrarOrden();
         
        // Crear la tercera orden y agregar los productos restantes
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto10);
        orden3.agregarProducto(producto1);  
        orden3.agregarProducto(producto2);
        orden3.mostrarOrden();
        
       
        //Tarea:
       //Crear mas objetos de tipo Producto = 10
      //Crear mas objetos de tipo Orden = 2
        
    }
}
