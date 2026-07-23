class Cubo:
    """
    Clase Cubo que representa un cubo tridimensional con atributos de ancho, altura y profundidad.
    Contiene un método para calcular el volumen.
    """
    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    def calcular_volumen(self):
        # Calcula el volumen del cubo
        return self.ancho * self.altura * self.profundidad

# Solicitar al usuario los valores
ancho = float(input("Ingrese el ancho del cubo: "))
altura = float(input("Ingrese la altura del cubo: "))
profundidad = float(input("Ingrese la profundidad del cubo: "))

# Crear una instancia de la clase Cubo
cubo = Cubo(ancho, altura, profundidad)

# Calcular y mostrar el volumen
volumen = cubo.calcular_volumen()
print(f"El volumen del cubo es: {volumen}")

