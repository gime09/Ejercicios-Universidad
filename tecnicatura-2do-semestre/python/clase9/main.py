def es_bisiesto(ano):
    if (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0):
        return True
    else:
        return False

opcion = 1

while opcion == 1:
    ano = int(input("Ingrese el año: "))
    if es_bisiesto(ano):
        print("El año es Bisiesto")
    else:
        print("El año no es Bisiesto")
    opcion = int(input("Para seguir adelante digite la opción 1: "))
print("Fin del proceso")


def calcular_suma(N):
    suma = 0
    for i in range(1, N + 1):
        suma += i
    return suma

# Solicitar al usuario la cantidad de números a sumarse
N = int(input("Digite la cantidad de números a sumarse: "))
resultado = calcular_suma(N)
print("La suma es:", resultado)

def contar_numeros():
    positivos = 0
    negativos = 0
    neutros = 0

    for _ in range(10):
        numero = float(input("Ingrese un número: "))
        if numero > 0:
            positivos += 1
        elif numero < 0:
            negativos += 1
        else:
            neutros += 1

    print("Cantidad de números positivos:", positivos)
    print("Cantidad de números negativos:", negativos)
    print("Cantidad de números neutros:", neutros)

contar_numeros()



def calcular_promedio_y_minima():
    calificaciones = []

    for i in range(10):
        calificacion = float(input(f"Ingrese la calificación del alumno {i + 1}: "))
        calificaciones.append(calificacion)

    promedio = sum(calificaciones) / len(calificaciones)
    calificacion_minima = min(calificaciones)

    print("Calificación promedio del grupo:", promedio)
    print("Calificación más baja del grupo:", calificacion_minima)

calcular_promedio_y_minima()
