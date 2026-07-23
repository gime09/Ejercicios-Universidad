# Ejercicio Integrador - Pokémon en Java

Este proyecto es una pequeña práctica de programación orientada a objetos en Java, donde se modelan varios Pokémon usando herencia e interfaces.

## ¿De qué trata?

La idea principal es representar distintos tipos de Pokémon con comportamientos distintos según su elementalidad:

- `Squirtle` → tipo agua
- `Charmander` → tipo fuego
- `Bulbasaur` → tipo planta
- `Pikachu` → tipo eléctrico

Cada una de estas clases hereda de una clase base llamada `Pokemon` y además implementa una interfaz específica que define sus ataques.

## Estructura del proyecto

### Clase base
- `Pokemon`: define atributos comunes y los métodos abstractos de ataque básicos.

### Clases concretas
- `Squirtle`: implementa ataques de agua.
- `Charmander`: implementa ataques de fuego.
- `Bulbasaur`: implementa ataques de planta.
- `Pikachu`: implementa ataques eléctricos.

### Interfaces
- `IAgua`: define los ataques de tipo agua.
- `IFuego`: define los ataques de tipo fuego.
- `IPlanta`: define los ataques de tipo planta.
- `IElectrico`: define los ataques de tipo eléctrico.

### Clase principal
- `EjercicioIntegrador`: es la clase que crea instancias de los Pokémon y ejecuta sus métodos de ataque.

## Cómo se ejecuta

Desde la raíz del proyecto, puedes compilar y ejecutar el programa con este comando:

```bash
cd /workspaces/EjercicioIntegrador && mkdir -p build/classes && javac -d build/classes $(find src -name '*.java') && java -cp build/classes Logica.EjercicioIntegrador
```

## Qué muestra el programa

Al ejecutarse, el programa imprime en consola varios mensajes con los ataques de cada Pokémon, por ejemplo:

- ataque arañazo
- hidrobomba
- lanzallamas
- drenaje
- impactrueno

## Objetivo del ejercicio

Este ejercicio sirve para practicar:

- herencia
- polimorfismo
- interfaces
- encapsulación básica
- uso de clases y objetos

## Observación

El proyecto está pensado como ejemplo académico y puede ser ampliado con más atributos, validaciones o lógica de batalla.
