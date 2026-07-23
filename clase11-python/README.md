
# Comandos

1. Abrir la terminal de Git Bash o la terminal en Linux; en Windows, debe ser como administrador.
2. Crear una carpeta o directorio:

```bash
mkdir python-final
```

3. Entrar en ella:

```bash
cd python-final
```

4. Iniciar el repositorio:

```bash
git init
```

5. Crear un archivo:

```bash
touch finales.py
```

6. Abrir VS Code:

```bash
code .
```

7. En la terminal, ingresar el comando para saber la versión de Python instalada:

```bash
python -V
python3 -V
```

8. Crear el entorno virtual en Python:

```bash
python3 -m venv venv
```

9. Activar el entorno virtual:

```bash
source venv/bin/activate
```

En Windows:

```bash
venv\Scripts\activate
```

10. Actualizar pip de Python:

```bash
python3 -m pip install --upgrade pip
```

11. Investigar qué es pip y por qué se actualiza.
12. Hacer el primer commit de este trabajo y unirlo al repositorio remoto.
13. Enviar el enlace del repositorio remoto donde tenga un README.md con todos los detalles de los comandos mostrados y la respuesta del punto 11.

## Respuesta del punto 11

PIP (Python Package Installer) es el sistema de gestión de paquetes estándar para Python. Permite instalar y gestionar paquetes de software escritos en Python que están disponibles en el Python Package Index (PyPI).

### ¿Qué es PIP?

- Gestor de paquetes: PIP facilita la instalación y gestión de paquetes de software escritos en Python.
- Acceso a PyPI: Se conecta al Python Package Index (PyPI), un repositorio global de paquetes de software para Python.
- Instalación de dependencias: PIP se usa principalmente para instalar dependencias externas que un proyecto de Python necesita para funcionar correctamente.

### ¿Por qué es importante actualizar PIP?

- Nuevas funcionalidades y mejoras: Las actualizaciones periódicas de PIP incluyen mejoras de rendimiento, nuevas funciones y correcciones de errores.
- Compatibilidad: Las versiones nuevas suelen ser más compatibles con las versiones recientes de Python y con los paquetes más actuales de PyPI.
- Corrección de vulnerabilidades: Algunas actualizaciones corrigen fallas de seguridad, por lo que es importante mantenerlo actualizado.

### Cómo actualizar PIP

```bash
pip install --upgrade pip
```

Este comando instala la última versión disponible de PIP desde PyPI y reemplaza la versión anterior si es necesario. Es una buena práctica ejecutarlo regularmente.

En resumen, PIP es esencial para la gestión de paquetes en Python y actualizarlo con frecuencia ayuda a mejorar compatibilidad, rendimiento y seguridad.






