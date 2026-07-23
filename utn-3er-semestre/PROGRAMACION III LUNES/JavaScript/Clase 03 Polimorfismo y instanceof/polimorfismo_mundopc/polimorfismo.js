
// polimorfismo.js

// Clase madre
class DispositivoEntrada {
  constructor(tipoEntrada, marca) {
    this._tipoEntrada = tipoEntrada;
    this._marca = marca;
  }

  toString() {
    return `Tipo de entrada: ${this._tipoEntrada}, Marca: ${this._marca}`;
  }
}

// Clase hija Raton
class Raton extends DispositivoEntrada {
  constructor(tipoEntrada, marca) {
    super(tipoEntrada, marca);
  }

  toString() {
    return `Ratón -> ${super.toString()}`;
  }
}

// Clase hija Teclado
class Teclado extends DispositivoEntrada {
  constructor(tipoEntrada, marca) {
    super(tipoEntrada, marca);
  }

  toString() {
    return `Teclado -> ${super.toString()}`;
  }
}

// Clase Monitor (no hereda de DispositivoEntrada)
class Monitor {
  constructor(marca, tamanio) {
    this._marca = marca;
    this._tamanio = tamanio;
  }

  toString() {
    return `Monitor -> Marca: ${this._marca}, Tamaño: ${this._tamanio}`;
  }
}

// Clase Computadora
class Computadora {
  constructor(nombre, monitor, teclado, raton) {
    this._nombre = nombre;
    this._monitor = monitor;
    this._teclado = teclado;
    this._raton = raton;
  }

  toString() {
    return `Computadora: ${this._nombre}\n${this._monitor.toString()}\n${this._teclado.toString()}\n${this._raton.toString()}`;
  }
}

// Funcion que aplica polimorfismo
function mostrarDispositivo(dispositivo) {
  console.log(dispositivo.toString());
}

// Pruebas
const raton1 = new Raton("USB", "Logitech");
const teclado1 = new Teclado("Bluetooth", "Redragon");
const monitor1 = new Monitor("LG", "24 pulgadas");

mostrarDispositivo(raton1);    // Ratón
mostrarDispositivo(teclado1);  // Teclado
mostrarDispositivo(monitor1);  // Monitor

const computadora1 = new Computadora("PC Gamer", monitor1, teclado1, raton1);
console.log(computadora1.toString());
