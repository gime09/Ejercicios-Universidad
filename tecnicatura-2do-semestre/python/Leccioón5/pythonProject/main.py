
# Comenzamos con Funciones

# mi_funcion() # No se puede llamar antes de definir a una función


# Definimos una función
def mi_funcion():  # Para identificar a la función utilizamos paréntesis
    print("Saludos a todos los alumnos de la tecnicatura")

# Llamamos a la función fuera de la definición
mi_funcion()  # Aquí llamamos a la función correctamente
mi_funcion()  # Se puede llamar a una función N canridad de veces

# Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name + " " + lastName)

# Fuera de la función show
person = ["Ariel", "Betancud"]
show(person[0], person[1])  # Pasamos uno por uno los datos de la lista a la función
show(*person)  # Esto es lo mismo de lo anterior pero le pasamos todo junto

person2 = ("Osvaldo", "Giordanini")  # Desempaquetamos a través de una tupla
show(*person2)

person3 = {"lastName": "Lucero", "name": "Natalia"}  # Desempaquetamos a través de un diccionario
show(**person3)

numbers = [1, 2, 3, 4, 5] # Aun con la lista vacía se va a ejecutar el else
for n in numbers:
    print(n)
    if n == 3:
        break  # Esta es la unica manera  par que no se ejecute el else
else:
    print("Esto se termino")

# List comprehension, lista de comprensión
names = ["Paolo", "Rodrigo","Lupe","Pepe"]
alongP = [p for p in names if p[0] == "P"] # Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belhium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de Argumentos (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven a través del canal de Youtube")
    print(f"Nombre: {name}, Apellido: {lastName}")

# Llamadas a la función fuera de la definición
mi_funcion2("Jorge", "Lucero")
mi_funcion2("Ariel", "Betancud")
mi_funcion2("Analia", "Pedrosa")

# La palabra return en funciones
# Creamos una función para sumar
def sumar(a, b):
    return a + b
# resultado = sumar(78, 22)
# print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(55,45)}")

def sumar2(a:int = 0, b:int = 0 )-> int: # Le damos un valor por default
    return a + b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(22, 66)}")

# Argumentos, variables en funciones
def listarNombres(*nombres):# Normalmente se utiliza: *args
    for nombres in nombres: # Se va a convertir en una tupla
        print(nombres)
listarNombres("Lucas", "José", "Claudia", "Rosa", "María")
listarNombres("Marcos", "Daniel", "Romina", "Pepe", "Marcela", "Carlos")

def listarTerminos( **terminos): # Lo más utilizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items(): # Kwargs significa: Key word argument
        print(f"{llave} : {valor}")

listarTerminos() # No recibe nada, nada se va a mostrar
listarTerminos(IDE="Integrated Develoment Enviroment", PK="Primary Key")
listarTerminos(Nombre="Leonel Messi")

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ["Tito", "Pedro", "Carlos"]
desplegarNombres(nombres2)
desplegarNombres("Carla") # Muestra cada uno de los elementos de la cadena
# desplegarNombres(10, 11) No es un objeto iterable
desplegarNombres((10, 11)) # Se convierte en una Tupla iterable, en un solo elemento no olvidar la coma
desplegarNombres([22, 55]) # Se convierte en una lista

# Funciones Recursivas
def factorial(numero):
    if numero == 1 : # Caso Base
        return 1
    else:
        return numero * factorial(numero-1) # Case Recursivo

resultado = factorial(5) # Lo hacemos en código duro
print(f"El factorial del número 5 es: {resultado}")

# TAREA: Que el usuario ingrese el número para calcular el factorial


# Solicitamos al usuario que ingrese un número
numero_usuario = int(input("Ingresa un número para calcular su factorial: "))

# Calculamos el factorial del número ingresado
resultado = factorial(numero_usuario)

# Mostramos el resultado
print(f"El factorial del número {numero_usuario} es: {resultado}")
