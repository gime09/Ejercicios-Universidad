"""
miVariable = 3
print(miVariable)
miVariable = "a"
print(miVariable)
miVariable = 3.5
print(miVariable)
x: int = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben x240

a: str = "Hola Mundo"
print(type(a))
b = 10.78
print(type(b))
c = True
print(type(c))
# Tipos int ,float ,String ,Bool
x = 10
print(x)
print(type(x))
x: float = 14.5
print(x)
print(type(x))
x: str = "Hola Alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = 'La Roux' "" + " " " y Lana del Rey"
caracteristicas = "The Best Singers"
print("Mi grupo favorito es: ", miGrupoFavorito + " " + caracteristicas)

numero1 = "7"
numero2 = "8"
print(numero1 + numero2)
print(int(numero1) + int(numero2))

# Tipos Booleanos (bool)
miBooleano = 1 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# Funcion input regresa un dato tipo string (recive cualquier dato y lo devuelve de tipo String)
resultado = input("Digite un número:")
print(resultado)

# Conversion de la entreada de datos
numero1 = int(input("Escribe el primer numero:"))
numero2 = int(input("Escribe el  segundo numeros:"))
resultado = numero1 + numero2
print("El resultado de la suma es:", resultado)

operandoA = 8
operandoB = 5
suma = operandoA + operandoB
print("Resultado de la suna:", suma)
print(f"El resultado de la suma es: {suma}")  # Sintacsis diferente, {INTERPOLACION}

resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicación es: {multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la division es: {division}")
division = operandoA // operandoB
print(f"El resultado  de la division (int) es: {division}")  # Quita el punto decimal
modulo = operandoA % operandoB
print(f"El resultado de la división o residuo (módulo) es: {modulo}")
exponenete = operandoA ** operandoB
print(f"El resultado del exponente es: {exponenete}")
"""
"""
alto = int(input("Proporciona el alto del rectangulo:"))
ancho = int(input("Proporciona el ancho del rectangulo:"))
area = alto * ancho
perimetro = (alto + ancho) * 2
print("Area:", area)
print("perimetro:", perimetro)
"""
"""
miVariable3 = 10
print(miVariable3)

# Operadores de reasignation
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1  # Mas reducido
print(miVariable3)

# miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

# Operadores de Comparación (Trabajamos de Manera Booleana)
d = 4
b = 2
resultado = d == b  # Comparamos si son iguales
print(resultado)

# Operador Diferente
resultado = d != b
print(resultado)

# Operador Mayor que
resultado = d > b
print(resultado)

# Operador  menor que
resultado = d < b
print(resultado)

# Operador menos o igual que
resultado = d <= b
print(resultado)

# Operador mayor o igual que
resultado = d >= b
print(resultado)
"""
"""
a = int(input("Digite un número:"))
print(f"El residuo de la división es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es : {a} es un número PAR")
else:
    print(f"El valor de a es: {a} es un número IMPAR")
"""
"""
edadAdulto = 18
edadPersona = int(input("Digite su edad:"))
if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona}  años, usted es mayor  de edad")
else:
    print(f' Su edad es: {edadPersona} años, usted es menor de edad')
"""
"""
# Operadores Lógicos
# and
a = False
b = True
resultado = a and b
print(resultado)
#or
resultado = a or b
print(resultado)
#not
resultado = not a
print(resultado)
"""
"""
# Ejercicio: Valor dentro de un rango
valor = int(input("Digite un número dentro del rango 0 al 5:"))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f'El valor {valor} está dentro del rango')
else:
    print(f'El valor {valor} no está dentro del rango')
"""
"""
#Ejercicio con el operador or, opertador not
vacaciones = True
diaDescanso = True
if not (vacaciones or diaDescanso):
    print("Tiene trabajo que hacer")
else:
    print("Puede asistir al juego")

"""
# Ejercicio: Rango entre 20 y 30 años
#edad = int(input("Digite su edad:"))
# veinte = edad >= 20 and edad < 30
# print(veinte)
# treinta = edad >= 30 and edad < 40
# print(treinta)

# if veinte or treinta:
 # print("Estas dentro del rango de los (20\'0 ) a (30\'0) años")
# else:
#  print("No estas dentro del rango de los (20'0 ) a (30'0) años")
"""
if (edad >= 20 and edad < 30) or (edad >= 30 and edad < 40):   # sintaxis simplificada del operador and
    print("Estás dentro del rango de los 20 a 40 años")
else:
    print("No estás dentro del rango de los 20 a 40 años")
"""
"""
#Ejercicio: El mayor de dos números
numero1 = int(input("Digite el valor para el numero1:"))
numero2 = int(input("Digite el valor para el numero2:"))

if numero1 > numero2:
    print("El numero 1 es mayor")
else:
    print("El numero 2 es mayor")
"""
#Ejercicio Tienda de Libro
nombre = input("Digite el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indicar si el envío es gratuito (True/False): ")

if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False"

print(f'''
Nombre: {nombre}
ID: {id}
Precio: {precio}
Envío Gratis?: {envioGratuito}
''')


