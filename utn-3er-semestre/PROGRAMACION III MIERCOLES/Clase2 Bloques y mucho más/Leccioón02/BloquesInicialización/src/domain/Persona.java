package domain;

public class Persona {

    private final int idPersona; //atributo no estatico
    private static int contadorPersonas;

    static { //Bloque de inicialización estático, se ejecuta antes del constructor y de un bloque no estatico 
        System.out.println("Ejecución del bloque estático");
        ++Persona.contadorPersonas; //atributo estatico
        //  idPersona = 10; No es un atributo estatico por esto tenemos un error 

    }

    {
        //Bloque de inicialización NO estático (contexto dinámico)
        System.out.println("Ejecución del bloque No estático");
        this.idPersona = Persona.contadorPersonas++; //Incrementamos el atributo

    }
    
    //Los bloques de inicialización se ejecutan antes del contructor
    
    public Persona(){
        System.out.println("Ejecución del constructor");
    }
    
    public int idPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

    
    
    
}
