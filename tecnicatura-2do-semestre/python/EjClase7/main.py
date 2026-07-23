
def calcular_estacion(mes):
    if mes in [1, 2, 3]:
        return "Verano"
    elif mes in [4, 5, 6]:
        return "Otoño"
    elif mes in [7, 8, 9]:
        return "Invierno"
    elif mes in [10, 11, 12]:
        return "Primavera"
    else:
        return None

# Pedir al usuario que ingrese un mes del año
mes = int(input("Ingrese un mes del año (1-12): "))

# Calcular y mostrar la estación del año
estacion = calcular_estacion(mes)
if estacion:
    print(f"El mes {mes} corresponde a la estación: {estacion}")
else:
    print("Mes inválido. Por favor, ingrese un valor entre 1 y 12.")
