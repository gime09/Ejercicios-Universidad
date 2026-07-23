from dominio.pelicula import Pelicula
from servicio.catalogo_peliculas import CatalogoPeliculas

opcion = None
while opcion != 4:
    print('Opciones:')
    print('1. Agregar película')
    print('2. Listar películas')
    print('3. Eliminar archivo de películas')
    print('4. Salir')
    try:
        opcion = int(input('Escribe tu opción (1-4): '))
    except ValueError:
        print("Por favor ingrese un número válido.")
        continue

    if opcion == 1:
        nombre = input('Proporciona el nombre de la película: ')
        pelicula = Pelicula(nombre)
        CatalogoPeliculas.agregar_pelicula(pelicula)
    elif opcion == 2:
        CatalogoPeliculas.listar_peliculas()
    elif opcion == 3:
        CatalogoPeliculas.eliminar()
    elif opcion == 4:
        print('Saliendo del programa...')
    else:
        print('Opción no válida. Intenta nuevamente.')
