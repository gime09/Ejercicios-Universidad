// Clase DispositivoEntrada - Clase madre para dispositivos de entrada
class DispositivoEntrada {
    constructor(tipoEntrada, marca) {
        this._tipoEntrada = tipoEntrada;
        this._marca = marca;
    }

    get tipoEntrada() {
        return this._tipoEntrada;
    }

    set tipoEntrada(tipoEntrada) {
        this._tipoEntrada = tipoEntrada;
    }

    get marca() {
        return this._marca;
    }

    set marca(marca) {
        this._marca = marca;
    }

    toString() {
        return `Tipo de entrada: ${this._tipoEntrada}, Marca: ${this._marca}`;
    }
}

// Clase Raton - Hereda de DispositivoEntrada
class Raton extends DispositivoEntrada {
    static contadorRatones = 0;

    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca);
        this._idRaton = ++Raton.contadorRatones;
    }

    get idRaton() {
        return this._idRaton;
    }

    toString() {
        return `Ratón [idRaton: ${this._idRaton}, ${super.toString()}]`;
    }
}

// Clase Teclado - Hereda de DispositivoEntrada
class Teclado extends DispositivoEntrada {
    static contadorTeclados = 0;

    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca);
        this._idTeclado = ++Teclado.contadorTeclados;
    }

    get idTeclado() {
        return this._idTeclado;
    }

    toString() {
        return `Teclado [idTeclado: ${this._idTeclado}, ${super.toString()}]`;
    }
}

// Clase Monitor
class Monitor {
    static contadorMonitores = 0;

    constructor(marca, tamanio) {
        this._idMonitor = ++Monitor.contadorMonitores;
        this._marca = marca;
        this._tamanio = tamanio;
    }

    get idMonitor() {
        return this._idMonitor;
    }

    get marca() {
        return this._marca;
    }

    set marca(marca) {
        this._marca = marca;
    }

    get tamanio() {
        return this._tamanio;
    }

    set tamanio(tamanio) {
        this._tamanio = tamanio;
    }

    toString() {
        return `Monitor [idMonitor: ${this._idMonitor}, Marca: ${this._marca}, Tamaño: ${this._tamanio}]`;
    }
}

// Clase Computadora
class Computadora {
    static contadorComputadoras = 0;

    constructor(nombre, monitor, teclado, raton) {
        this._idComputadora = ++Computadora.contadorComputadoras;
        this._nombre = nombre;
        this._monitor = monitor;
        this._teclado = teclado;
        this._raton = raton;
    }

    get idComputadora() {
        return this._idComputadora;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get monitor() {
        return this._monitor;
    }

    set monitor(monitor) {
        this._monitor = monitor;
    }

    get teclado() {
        return this._teclado;
    }

    set teclado(teclado) {
        this._teclado = teclado;
    }

    get raton() {
        return this._raton;
    }

    set raton(raton) {
        this._raton = raton;
    }

    toString() {
        return `Computadora ${this._idComputadora}: ${this._nombre}\n` +
               `${this._monitor.toString()}\n` +
               `${this._teclado.toString()}\n` +
               `${this._raton.toString()}`;
    }
}

// Clase Orden
class Orden {
    static contadorOrdenes = 0;

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._computadoras = [];
    }

    get idOrden() {
        return this._idOrden;
    }

    agregarComputadora(computadora) {
        this._computadoras.push(computadora);
    }

    mostrarOrden() {
        let ordenStr = `Orden: ${this._idOrden}\nComputadoras:\n`;
        
        for (let computadora of this._computadoras) {
            ordenStr += `${computadora.toString()}\n---------------------------\n`;
        }
        
        return ordenStr;
    }
}

// Pruebas de la implementación
// Creamos dispositivos de entrada
const raton1 = new Raton("USB", "HP");
const teclado1 = new Teclado("Bluetooth", "MSI");
const monitor1 = new Monitor("LG", "24 pulgadas");

// Creamos una computadora
const computadora1 = new Computadora("PC Gaming", monitor1, teclado1, raton1);

// Creamos otra computadora con diferentes componentes
const raton2 = new Raton("USB-C", "Logitech");
const teclado2 = new Teclado("USB", "Logitech");
const monitor2 = new Monitor("Samsung", "27 pulgadas");
const computadora2 = new Computadora("PC Oficina", monitor2, teclado2, raton2);

// Creamos una orden
const orden1 = new Orden();
orden1.agregarComputadora(computadora1);
orden1.agregarComputadora(computadora2);

// Mostramos la orden
console.log(orden1.mostrarOrden());

// Creamos una nueva orden con un solo producto
const orden2 = new Orden();
orden2.agregarComputadora(computadora2);

// Mostramos la segunda orden
console.log(orden2.mostrarOrden());
