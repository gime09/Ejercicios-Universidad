from NumerosIgualesException import NumerosIgualesException

# try:
#    10/0
# except Exception as e:
#    print(f"Ocurrió un error: {e}")

# try:
#    10 / 0
# except ZeroDivisionError as e:
#    print(f"Ocurrió un error: {e}")

"""
resultado = None
a = 7
b = 5
try:
    resultado = a / b # modificamos
except TypeError as e:
    print(f"TypeErrror - Ocurrió un error: {type(e)}")
except ZeroDivisionError as e:
    print(f"ZeroDivisionError - Ocurrió un error:{type (e)}")
except Exception as e:
    print(f"Exception - Ocurrió un  un error: {type(e)}")

print(f"El resultado es: {resultado}")
print("seguimos...")

"""
resultado = None

try:
    a = int (input("Digite el primer número: "))
    b = int(input("Digite el segundo número: "))
    if a == b:
        raise NumerosIgualesException("Son números iguales")
    resultado = a / b # modificamos
except TypeError as e:
    print(f"TypeErrror - Ocurrió un error: {type(e)}")
except ZeroDivisionError as e:
    print(f"ZeroDivisionError - Ocurrió un error:{type (e)}")
except Exception as e:
    print(f"Exception - Ocurrió un  un error: {type(e)}")
else:
    print("No se arrojo ninguna excepción")
finally: # Siempre se va a ejecutar
    print("Ejecución de este bloque finally")

print(f"El resultado es: {resultado}")
print("seguimos...")
