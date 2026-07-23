class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other): # otro
        return f"{self.nombre} {other.nombre}"

    def __sub__(self, other):  # Resta de edades
        return self.edad - other.edad

persona1 = Persona("Ariel", 40)
persona2 = Persona("Betancud", 5)

# persona1.__init__(persona2) sintaxis interna y automatica

print(persona1 + persona2)
print(persona1 - persona2)



