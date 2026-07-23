class Persona2:
    def __init__(self, nombre: object, apellido: object, edad: object) -> object: # Esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Los datos a mostar son los siguientes: {self._nombre} {self._apellido} {self._edad}")


    @property #decorador
    def nombre(self): # Método Getter
        print("Estamos usando el método get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre): # Método Setter
        print("Estamos usando el método set")
        self._nombre = nombre

    @property
    def apellido(self):  # Método Getter para apellido
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):  # Método Setter para apellido
        self._apellido = apellido

    @property
    def edad(self):  # Método Getter para edad
        return self._edad

    @edad.setter
    def edad(self, edad):  # Método Setter para edad
       self._edad = edad

    def __del__(self):
       print(f"Persona2_: {self._nombre} {self._apellido} {self._edad}")

if __name__ == "__main__":
    persona1 = Persona2("Ariel", "Betancud", 41)
    print(persona1._nombre)  # Llamamos al método getter
    persona1.nombre = "Juan Pedro"  # Llamamos el método setter
    print(persona1.nombre)  # Otra vez con el método getter
    persona1.mostrar_detalles()  # Llamamos el método mostrar_detalles
    # Atributo read-only sería la edad porque no tiene el método set
    print(persona1.edad)

    # Tarea crear tres objetos más, utilizando los métodos getter and setter
    # para modificar, y mostrar los cambios
    # Crear tres objetos más de la clase Persona2
    persona2 = Persona2("Carola", "Rodriguez", 41)
    persona3 = Persona2("Carolina", "González", 25)
    persona4 = Persona2("Fernando", "Pérez", 30)

    # Mostrar detalles antes de hacer modificaciones
    persona2.mostrar_detalles()
    persona3.mostrar_detalles()
    persona4.mostrar_detalles()

    # Modificar los nombres utilizando los setters
    persona2.nombre = "Andrés Modificado"
    persona3.nombre = "Lucía Modificada"
    persona4.nombre = "Carlos Modificado"

    # Mostrar detalles después de hacer modificaciones
    persona2.mostrar_detalles()
    persona3.mostrar_detalles()
    persona4.mostrar_detalles()
