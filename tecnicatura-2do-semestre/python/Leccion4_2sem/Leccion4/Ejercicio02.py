# Ejercicio 2: Modificar los elemntos de una lista
# Llenar una lista con los número del 1 al 10, luego modificar los
# Elementos de la lista multiplicandolos por un valor ingresado por el ususario
lista = list(range(1, 11))
print("Lista Original")
for i in lista:
    print(i, end="-")
valor = int(input("\nDigite un valor a multiplicar: "))
# Multiplicamos todos los elementos de la lista
for indice, i in enumerate(lista): # Función para modificar los indice de la lista
    lista[indice] *= valor    # El iterador solo recorre los indices, en esta línea se multiplica

print(f"Lista final con los elementos multiplicados por {valor}")
for i in lista:
    print(i, end="-")
