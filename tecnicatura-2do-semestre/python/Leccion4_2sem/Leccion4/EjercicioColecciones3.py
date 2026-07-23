# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos
# Nombre: Aragon
# Clase: Guerrero
# Raza: Dúnadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar

personajes = [] # Creamos una lista vacia
# Creamos diccionarios
P1 = {"Nombre": "Aragon", "Clase": "Guerrero", "Raza": "Dúnadan del Norte"}
personajes.append(P1) # Agregamos a la lista un personaje
P2 = {"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"}
personajes.append(P2) # Agregamos a la lista un personaje
P3 = {"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo sindar"}
personajes.append(P3) # Agregamos a la lista un personaje
print(personajes)
# Tarea: Agregar otros 3 personajes que sean de tu eleccion
P4 = {"Nombre": "Frodo", "Clase": "Portador del Anillo", "Raza": "Hobbit"}
personajes.append(P4)

P5 = {"Nombre": "Gimli", "Clase": "Guerrero", "Raza": "Enano"}
personajes.append(P5)

P6 = {"Nombre": "Boromir", "Clase": "Guerrero", "Raza": "Humano"}
personajes.append(P6)

# Imprimimos la lista completa de personajes
print(personajes)
