
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("persona1: " + persona1);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        //Modificar a través de los métodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; //Ya no se puede utilizar
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo:"+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano:"+persona1.isEliminado());
        //Tarea:Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //e imprimir,luego modificar sus valores y volver a imprimir  
        Persona persona2 = new Persona("Ana Maria", 35.500, true);
        System.out.println("\npersona2 su nombre es: " + persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: " + persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: " + persona2.isEliminado());
        
        // Modificar valores de persona2
        persona2.setNombre("María Elena");
        persona2.setSueldo(40.000);
        persona2.setEliminado(false);
        
        // Imprimir valores modificados de persona2
        System.out.println("\nValores modificados de persona2:");
        System.out.println("persona2 su nombre es: " + persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: " + persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: " + persona2.isEliminado());
        
        System.out.println("persona1: " + persona1);
        
    }
    
    
    
    
    
    
    
}
