# Ejercicio 6: Tabla de multiplicar

# Hacer un programa que pida un número por teclado y guarde
# En una lista su tabla de multiplicar hasta el 10.

numero = int(input("Digite un número: "))
lista = [] # Creamos una lista vacía
for i in range(1,11):
    lista.append(i*numero)

    print(f"\nTabla de multiplicar del {numero}: \n {lista}")

for indice, i in enumerate(lista):
    print(f"{i} X {numero} = {lista[indice]}") # Este ciclo es para ver el formato de una tabla de multiplicar
