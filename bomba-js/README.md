# Bomba JS

## Descripción

Este proyecto es una pequeña aplicación web con una cuenta regresiva interactiva estilo "bomba". La interfaz muestra un tiempo visible en pantalla, una animación de alarma y un botón para reiniciar la cuenta.

## Tecnologías

- HTML5
- CSS3
- JavaScript vanilla

## Requisitos

- Navegador web moderno
- Python 3 para servir la aplicación localmente

## Cómo ejecutar

1. Abrí una terminal en la raíz del proyecto.
2. Ejecutá:

```bash
cd /workspaces/bomba-js
python3 -m http.server 8000
```

3. Abrí en el navegador:

```text
http://localhost:8000
```

## Estructura del proyecto

- `index.html`: estructura principal de la interfaz.
- `style.css`: estilos visuales y animaciones.
- `prueba.js`: lógica de la cuenta regresiva.

## Funcionalidades

- Cuenta regresiva de 10 a 0
- Cambio visual cuando quedan pocos segundos
- Botón de reinicio
- Animación final de explosión
