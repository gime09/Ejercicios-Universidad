from mundo_pc.monitor import Monitor
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

class Computadora:
    contador_computadoras = 0

    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contador_computadoras += 1
        self.id_computadora = Computadora.contador_computadoras
        self.nombre = nombre
        self.monitor = monitor
        self.teclado = teclado
        self.raton = raton

    def __str__(self):
        return f"""
    Nombre: {self.nombre}
    ID: {self.id_computadora}
    Monitor: {self.monitor}
    Teclado: {self.teclado}
    Ratón: {self.raton}
    """

if __name__ == "__main__":
    teclado1 = Teclado("HP", "USB")
    monitor1 = Monitor("HP", "15 Pulgadas")
    raton1 = Raton("HP", "USB")

    computadora1 = Computadora("HP", monitor1, teclado1, raton1)
    print(computadora1)

    teclado2 = Teclado("Acer", "Bluetooth")
    monitor2 = Monitor("Acer", "27 Pulgadas")
    raton2 = Raton("Acer", "Bluetooth")

    computadora2 = Computadora("Acer", monitor2, teclado2, raton2)
    print(computadora2)