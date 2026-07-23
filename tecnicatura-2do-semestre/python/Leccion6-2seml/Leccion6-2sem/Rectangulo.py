class Rectangulo:
    """
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base
    el nombre del método será calcular area utilizando la formula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por el usuario y los objetos
    deben ser tres

    """

    class Rectangulo:
        """
        Clase Rectangulo que representa un rectángulo con dos atributos: base y altura.
        Contiene un método para calcular el área.
        """

        def __init__(self, base, altura):
            self.base = base
            self.altura = altura

        def calcular_area(self):
            # Calcula el área del rectángulo
            return self.base * self.altura

    # Solicitar al usuario los valores de base y altura para tres rectángulos
    for i in range(3):
        base = float(input(f"Ingrese la base del rectángulo {i + 1}: "))
        altura = float(input(f"Ingrese la altura del rectángulo {i + 1}: "))

        # Crear una instancia de la clase Rectangulo
        rectangulo = Rectangulo(base, altura)

        # Calcular y mostrar el área
        area = rectangulo.calcular_area()
        print(f"El área del rectángulo {i + 1} es: {area}")
