# Ejercicio 1: Llenar una lista
# Llenar una lista con los números del 1 al 50, luego mostrar
# La lista con el bucle for, los elementos deben mostratse
# de la siguiente forma:
# 1-2-3-4-5...-50

lista = []
i = 1

# Llenamos la lista con números del 1 al 50
# while i <= 50:
#    lista.append(i)
#    i += 1

# Mostramos la lista con un bucle for, separados por "-"
# for i in lista:
#    if i == 50:
#        print(i)  # Evitamos agregar el guion al final del último número
#    else:
#        print(i, end="-")

lista = list(range (1, 51))  # Algoritmo eficas (corto)
for i in lista:
    print(i, end="-")

