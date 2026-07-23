# Ciclo While (Mientras o durante)
"""
contador = 0
while contador < 3:
    # Ejecutamos el ciclo while 3 veces
    print("Ejecutamos nuestro ciclo while ", contador)
    contador += 1
else:
    # Se ha completado el ciclo while
    print("Fin del ciclo while")

# Imprimir números del 0 al 5 con el ciclo while

maximo = 5
contador = 0
while contador <= maximo:
    # Imprimir el valor actual del contador
    print(contador)
    contador += 1

# Se agregó una línea en blanco al final del archivo.


minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1

#Ciclo for
cadena = "Hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")


# Palabra reservada break
for letra in "Alemania":
    if letra == "a":
        print(f"Letra encontrada: {letra}")
        break
else:
    print("Fin del ciclo for")
"""
# Palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f"Valor: {i}")

for i in range(6):
    if i % 2 != 0:
        continue
    print(f"Valor: {i}")


