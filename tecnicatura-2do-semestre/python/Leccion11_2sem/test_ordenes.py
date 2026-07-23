from Orden import Orden
from Producto import Producto

# Crear los productos iniciales
producto1 = Producto("Camiseta", 100.00)
producto2 = Producto("Pantalon", 150.00)
producto3 = Producto("Medias", 45.00)
producto4 = Producto("Campera", 2500.00)
producto5 = Producto("Sweter", 95.00)
producto6 = Producto("Blusa", 75.00)

# Lista inicial de productos
productos1 = [producto1, producto2]

# Crear orden1 con los productos iniciales
orden1 = Orden(productos1)
print(orden1)
print(f"Total de la orden1: {orden1.calcular_total()}")

# Crear orden2 con los mismos productos iniciales
orden2 = Orden(productos1)
print(orden2)

# Crear y agregar nuevos productos a orden2
producto3 = Producto("Zapatos", 200.00)
producto4 = Producto("Sombrero", 50.00)

# Agregar los nuevos productos a orden2
orden2.agregar_producto(producto3)
orden2.agregar_producto(producto4)


# Imprimir la orden2 y su total después de agregar nuevos productos
print(orden2)
print(f"Total de la orden2 después de agregar nuevos productos: {orden2.calcular_total()}")

