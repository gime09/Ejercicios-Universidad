# Partículas

Proyecto sencillo en JavaScript que crea una animación de partículas con explosiones automáticas sobre un canvas. La escena se actualiza en tiempo real y genera una sensación visual de fuegos artificiales o chispas flotantes.

## Descripción

Este proyecto muestra cómo crear una animación interactiva usando HTML, CSS y JavaScript puro. Cada explosión genera un conjunto de partículas con distintos colores, velocidades y grados de opacidad, que se desvanecen a medida que la animación avanza.

## Características

- Animación de partículas en un canvas.
- Explosiones automáticas cada 500 ms.
- Diseño ligero y sin dependencias externas.
- Fácil de ejecutar y modificar.

## Requisitos

- Un navegador moderno.
- Un servidor local opcional para abrir el proyecto más fácilmente.

## Cómo ejecutar

### Opción 1: abrir directamente

1. Descarga o clona este repositorio.
2. Abre el archivo `index.html` en tu navegador.

### Opción 2: usar un servidor local

Desde la raíz del proyecto, ejecuta:

```bash
python3 -m http.server 8000
```

Luego abre en tu navegador la siguiente URL:

```text
http://localhost:8000
```

## Estructura del proyecto

- `index.html`: estructura base de la página.
- `style.css`: estilos de la escena.
- `particulas.js`: lógica de animación y creación de partículas.

## Tecnologías utilizadas

- HTML5
- CSS3
- JavaScript

## Personalización

Puedes ajustar varios aspectos del proyecto modificando valores en `particulas.js`, como:

- el número de partículas por explosión,
- los colores disponibles,
- la frecuencia de las explosiones,
- la velocidad y el tamaño de las partículas.

