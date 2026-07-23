
# Definir la función para calcular el factorial
def calcular_factorial(num):
    if num < 0:
        return "El número debe ser mayor o igual a 0"
    elif num == 0:
        return 1
    else:
        factorial = 1
        for i in range(1, num + 1):
            factorial *= i
        return factorial

# Solicitar al usuario que ingrese un número
num = int(input("Digite un número: "))

# Calcular el factorial
resultado = calcular_factorial(num)

# Imprimir el resultado
print(f"El factorial de {num} es: {resultado}")
