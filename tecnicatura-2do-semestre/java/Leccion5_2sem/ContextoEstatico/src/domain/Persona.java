package domain;

public class Persona {
    // Atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    // Constructor sin argumentos
    public Persona() {
        // Asignamos un id único al crear el objeto
        this.idPersona = ++Persona.contadorPersona;
    }

    // Constructor con parámetros
    public Persona(String nombre) {
        // Asignamos un id único y establecemos el nombre
        this.idPersona = ++Persona.contadorPersona;
        this.nombre = nombre;
    }

    // Método estático para obtener el contador de personas
    public static int getContadorPersona() {
        return contadorPersona;
    }

    // Métodos getter y setter
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para representar la información del objeto
    @Override
    public String toString() {
        return "Persona{idPersona=" + idPersona + ", nombre=" + nombre + "}";
    }
}

