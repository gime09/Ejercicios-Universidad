# Declaramos una variable
archivo = None  # Inicializamos la variable
try:
    archivo = open("prueba.txt", "w", encoding="utf8")
    archivo.write("Programamos con diferentes tipos de archivos, ahora en txt. \n")
    archivo.write("Con esto terminamos\n")
    archivo.write("Los acentos son importantes para las palabras\n")
    archivo.write("como por ejemplo: acción, ejecución y producción\n")
    archivo.write("Las letras son:\nr read leer, \na append anexar, \nw write escribir, \nx crea un archivo")
    archivo.write("saludos a todos los alumnos de  la tecnicatura\n")
    archivo.write("\nt esta es para texto o text, \nb archivos binarios,\nw+ lee y escribe son iguales r+\n")
    archivo.write("Con esto terminamos")
except Exception as e:
    print(e)
finally: # siempre se ejecuta
    archivo.close() # Con esto se debe cerrar el archivo
# archivo.write("Todo quedo perfecto"): este esun error
