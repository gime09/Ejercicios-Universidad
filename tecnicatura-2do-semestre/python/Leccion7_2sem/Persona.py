class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

class Empleado(Persona):  # Esta clase es hija de la clase Persona
    def __init__(self, nombre, edad,  sueldo):
        super().__init__(nombre, edad)
        self.sueldo = sueldo

empleado1 = Empleado("Ariel", 40, 75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

# Tarea: encapsular los atributos y agregar los métodos getters and setters
# Crear otro objeto, pasar los datos para nombre, edad y sueldo
# Mostrar estos datos, luego modificar y mostrar nuevamente


class Persona:
    def __init__(self, nombre, edad):
        self._nombre = nombre  # Atributo privado
        self._edad = edad      # Atributo privado

    # Métodos getters
    def get_nombre(self):
        return self._nombre

    def get_edad(self):
        return self._edad

    # Métodos setters
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_edad(self, edad):
        self._edad = edad
    def __str__(self): # Override = sobreescribir
        return f"Persona: [ Nombre: {self._nombre}, Edad: {self._edad} ]"
class Empleado(Persona):  # Esta clase es hija de la clase Persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo  # Atributo privado

    # Métodos getters
    def get_sueldo(self):
        return self._sueldo

    # Métodos setters
    def set_sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f"Empleado: [ Sueldo: {self._sueldo} ] {super().__str__()} "


# Crear un objeto de Empleado
empleado1 = Empleado("Ariel", 40, 75000)
print(empleado1.get_nombre())  # Ariel
print(empleado1.get_edad())    # 40
print(empleado1.get_sueldo())  # 75000

# Modificar los datos
empleado1.set_nombre("Juan")
empleado1.set_edad(45)
empleado1.set_sueldo(80000)

# Mostrar nuevamente los datos modificados
print(empleado1.get_nombre())  # Juan
print(empleado1.get_edad())    # 45
print(empleado1.get_sueldo())  # 80000
