
package test;

import domain.*;


public class TestInstanceOf {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000); // tipo empleado a lo que esta apuntando la memoria(lo que se ha creado del lado derecho)
        determinarTipo(empleado1);                                                 // empleado1 es la variable
        empleado1 = new Gerente("José", 5000, "Sistemas");
     //   determinarTipo(empleado1); 
                   
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;   
            System.out.println("gerente= " +gerente.getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
          //  Gerente gerente = (Gerente)empleado;
         //  System.out.println("gerente= " +gerente.getDepartamento());
        }
        else if((empleado instanceof Object)){
        
            System.out.println("Es un tipo object");
        }
        
        
        
    }
    
}
