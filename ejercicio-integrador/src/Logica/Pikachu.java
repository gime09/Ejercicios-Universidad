
package Logica;


public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    

    @Override
    protected void atacarPlacaje() {
        System.out.println(" Hola soy pickachu y este es mi ataque placaje");
        
        
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println(" Hola soy Pikachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordico() {
        System.out.println(" Hola soy Pickachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println(" Hola soy Pikachu  y este es mi ataque impactar trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println(" Hola soy Pikachu y este es mi ataque puñio trueno");
    }
    
    
    
    
    
}
