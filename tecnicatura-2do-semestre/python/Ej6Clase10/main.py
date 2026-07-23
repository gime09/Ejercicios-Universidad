# Solicitamos al usuario la cantidad de números a ingresar
N = int(input("Digite la cantidad de números a ingresar: "))
# Inicializamos listas y variables
numeros = []
suma_pares = 0
conteo_pares = 0
suma_impares = 0
conteo_impares = 0
# Solicitamos los números y los almacenamos en la lista
for i in range(N):
    numero = int(input(f"Ingrese el número {i+1}: "))
    numeros.append(numero)
# Procesamos la lista de números
for numero in numeros:
    if numero % 2 == 0:
        suma_pares += numero
        conteo_pares += 1
    else:
        suma_impares += numero
        conteo_impares += 1
# Calculamos el promedio de los números impares
if conteo_impares > 0:
    promedio_impares = suma_impares / conteo_impares
else:
    promedio_impares = 0  # Si no hay impares, el promedio es 0
# Imprimimos los resultados
print(f"La suma de los números pares es: {suma_pares}")
print(f"El conteo de números pares es: {conteo_pares}")
print(f"El promedio de los números impares es: {promedio_impares}")



