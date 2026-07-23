class MiClase:
    # Variable de clase
    variable_clase = "Esta es una variable de clase"

    def __init__(self, variable_instancia):
        # Variable de instancia
        self.variable_instancia = variable_instancia

    @staticmethod
    def metodo_estatico():
        print(MiClase.variable_clase)


    @classmethod
    def metodo_clase(cls):
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)




# Pruebas
miClase1 = MiClase("Esta es una variable de instancia")
print(miClase1.variable_instancia)  # Muestra la variable de instancia
print(miClase1.variable_clase)      # Muestra la variable de clase desde la instancia

miClase2 = MiClase("Esta es otra prueba de variable de instancia")
print(miClase2.variable_instancia)  # Muestra la variable de instancia de miClase2
print(miClase2.variable_clase)      # Muestra la variable de clase desde otra instancia

# Agregar nueva variable de clase
MiClase.variable_clase2 = "Valor de variable de Clase 2"
print(MiClase.variable_clase2)      # Muestra la nueva variable de clase
print(miClase1.variable_clase2)     # Muestra la nueva variable de clase desde la instancia
print(miClase2.variable_clase2)     # Muestra la nueva variable de clase desde otra instancia

# Llamada al método estático
MiClase.metodo_estatico()

MiClase.metodo_clase()
miObjeto1 = MiClase("variable de instancia")
miObjeto1.metodo_clase()
miObjeto1.metodo_instancia()