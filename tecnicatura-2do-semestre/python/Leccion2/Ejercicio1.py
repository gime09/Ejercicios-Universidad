# Ejercio 1:
"""
a = float(input("Digite el valor de a: "))
b = float(input("Digite el valor de b: "))
c = float(input("Digite el valor de c: "))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
print(f"El resultado es: {resultado}")

"""
# Ejercicio 2:
# Determinar la solución lógica de la siguiente operación ((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)
"""
a = 10
b = 5
expr1 = (3 + 5 * 8) < 3
expr2 = ((-6 / 3 * 4) + 2) < 2
expr3 = a > b
result = (expr1 and expr2) or expr3
print("Resultado de la expresión:", result)

"""
# Ejercicio 3:
# Intercambiar el valor de dos variables.
# Por ejemplo:
# a = 10        a = 5
# b = 5              b = 10
"""
a = 100
b = 50

a = a + b
b = a - b
a = a - b

print("a =", a)
print("b =", b)

"""
# Ejercicio 4: Área y longitud de un circulo
# Hacer un programa para ingresar el radio de un circulo y se reporte su área y la longitud de la circunferencia.
# Área = Pi * r2
# Longitud = 2 * Pi * r
# En este ejercicio vamos a necesitar importar el modulo math porque tiene el valor de Pi
# Se escribe: import math

import math


def main():
    radio = float(input("Ingresa el radio del círculo: "))

    area = math.pi * radio ** 2
    longitud = 2 * math.pi * radio

    print(f"El área del círculo es: {area}")
    print(f"La longitud de la circunferencia es: {longitud}")

if __name__ == "__main__":
    main()
