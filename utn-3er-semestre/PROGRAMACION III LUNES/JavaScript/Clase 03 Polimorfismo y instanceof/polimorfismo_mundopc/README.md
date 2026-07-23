
# Proyecto Polimorfismo MundoPC

Este proyecto implementa **polimorfismo** en JavaScript basado en el ejercicio de MundoPC.

## ¿Qué incluye?
- **DispositivoEntrada**: Clase madre para dispositivos de entrada.
- **Raton** y **Teclado**: Clases hijas que heredan de DispositivoEntrada y sobrescriben el método `toString()`.
- **Monitor**: Clase independiente.
- **Computadora**: Clase que agrupa monitor, teclado y ratón.

## ¿Cómo se aplica el Polimorfismo?
Creamos una función `mostrarDispositivo(dispositivo)` que recibe cualquier objeto (`Raton`, `Teclado` o `Monitor`) y llama a su método `toString()`:
- Cada objeto responde según su clase real.
- No es necesario que `mostrarDispositivo` sepa el tipo de objeto.

## Pruebas
Se crean instancias de Raton, Teclado y Monitor, y se utilizan en una Computadora.

## Cómo correrlo
1. Guardar ambos archivos en la misma carpeta.
2. Ejecutar `polimorfismo.js` en un entorno Node.js o en la consola del navegador.

---
**TAREA**: Trabajo práctico de MundoPC - 3er semestre
