import os
from dominio.pelicula import Pelicula

class CatalogoPeliculas:
    ruta_archivo = 'peliculas.txt'

    @staticmethod
    def agregar_pelicula(pelicula: Pelicula):
        with open(CatalogoPeliculas.ruta_archivo, 'a', encoding='utf-8') as archivo:
            archivo.write(pelicula.nombre + '\n')

    @staticmethod
    def listar_peliculas():
        if os.path.exists(CatalogoPeliculas.ruta_archivo):
            with open(CatalogoPeliculas.ruta_archivo, 'r', encoding='utf-8') as archivo:
                print('Catálogo de películas:')
                print(archivo.read())
        else:
            print('No hay películas registradas.')

    @staticmethod
    def eliminar():
        if os.path.exists(CatalogoPeliculas.ruta_archivo):
            os.remove(CatalogoPeliculas.ruta_archivo)
            print('Archivo eliminado.')
        else:
            print('El archivo no existe.')
