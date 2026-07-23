class Producto {
    static contadorProductos = 0;

    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto() {
        return this._idProducto;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get precio() {
        return this._precio;
    }

    set precio(precio) {
        this._precio = precio;
    }

    toString() {
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
} // Fin de la clase Producto

class Orden {
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS() {
        return 5;
    }

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden() {
        return this._idOrden;
    }

    agregarProducto(producto) {
        if (this._productos.length < Orden.getMAX_PRODUCTOS()) {
            this._productos.push(producto); 
        } else {
            console.log("No se pueden agregar más productos");
        }
    } // Fin del método agregarProducto

    calcularTotal() {
        let totalVenta = 0;
        for (let producto of this._productos) {
            totalVenta += producto.precio;
        }
        return totalVenta;
    } // Fin del método calcularTotal

    mostrarOrden() {
        let productosOrden = "";
        for (let producto of this._productos) {
            productosOrden += `\n{${producto.toString()}}`;
        }
        console.log(`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productosOrden}`);
    } // Fin del método mostrarOrden
}  // Fin de la clase Orden

// Ejemplo de uso
let producto1 = new Producto("Pantalón", 200);
let producto2 = new Producto("Camisa", 150);
let producto3 = new Producto("Cinturón", 50);
let orden1 = new Orden();
let orden2 = new Orden();

orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
// Intento de añadir un sexto producto, lo cual excede el límite
orden1.agregarProducto(producto3); // Esto debería activar el mensaje de error

orden1.mostrarOrden();
orden2.mostrarOrden();

