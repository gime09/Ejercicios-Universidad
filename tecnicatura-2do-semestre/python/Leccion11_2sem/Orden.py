from Producto import Producto
class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto)  # Esto es para agregar un nuevo producto

    def calcular_total(self):
        total = 0 # variable temporal para almacenar el total temporal
        for producto in self._productos:
            total += producto.precio
        return total

    def __str__(self):
        productos_str = ""
        for producto in self._productos:
            productos_str += producto.__str__()+"|"
        return f"Orden: {self.id_orden}, \nProducto: {productos_str}"


if __name__ == "__main__":  # Solo visible si se ejecuta desde aquí
    producto1 = Producto("Camiseta", 100.00)
    print(producto1)
    producto2 = Producto("Pantalon", 150.00)
    print(producto2)

    productos1 = [producto1, producto2]  # Lista de productos
    orden1 = Orden(productos1)  # Crea la primera orden pasando la lista de productos
    print(orden1)
    print(f"Total de la orden: {orden1.calcular_total()}")
    orden2 = Orden(productos1)
    print(orden2)

#Tarea: Modificar la orden2 ingresando nuevos productos con sus nombres y precios
# Crear una nueva lista de productos y agregarla a la orden2

# Creamos nuevos productos
#producto3 = Producto("Zapatos", 200.00)
#print(producto3)
#producto4 = Producto("Sombrero", 50.00)
#print(producto4)

# Creamos una nueva lista de productos
#nuevos_productos = [producto3, producto4]

# Agregamos los nuevos productos a la orden2
#for producto in nuevos_productos:
  #  orden2.agregar_producto(producto)

# Imprimimos la orden2 para verificar los cambios
#print(orden2)
#print(f"Total de la orden2 después de agregar nuevos productos: {orden2.calcular_total()}")
