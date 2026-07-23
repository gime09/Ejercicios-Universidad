archivo = open("prueba.txt", "r", encoding="utf8")  # Las letras son: "r" read, "a" append, "w" write, "x" create

# print(archivo.read())
# print(archivo.read(16))
# print(archivo.read(10))  # Continuamos desde la línea anterior
# print(archivo.readline())
# print(archivo.readline())
# Vamos a iterar el archivo, cada una de las líneas
# for linea in archivo:
# print(linea): iteramos todos los elementos del archivo
# print(archivo.readline()[11]) # accedemos al archivo como si fuera una lista

# Anexamos información, copiamos a otro archivo

try:
    # Abrimos los archivos
    with open("prueba.txt", "r", encoding="utf8") as archivo, \
         open("copia.txt", "a", encoding="utf8") as archivo2:
        archivo2.write(archivo.read())
        print("Archivo copiado correctamente.")

except FileNotFoundError:
    print("Error: El archivo 'prueba.txt' no fue encontrado.")

except IOError as e:
    print(f"Error de entrada/salida: {e}")

except Exception as e:
    print(f"Ocurrió un error inesperado: {e}")

print("se ha terminado el proceso de leer y copiar archivos")