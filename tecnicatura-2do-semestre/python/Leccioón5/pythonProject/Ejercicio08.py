# Ejercicio 8: Menú interactivo - Cajero automático
# Hacer un programa que simule un cajero automático con un saldo
# inicial de 1000$ y tendrá el siguiente menú de opciones:
#                    1. Ingresar dinero en la cuenta
#                    2. Retirar dinero de la cuenta
#                    3. Mostrar dinero dosponible
#                    4. Salir


saldo = 1000
while True:
    print("\t.:Menú:.")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")

    opcion = int(input("Digite una opción de menú: "))
    print()

    if opcion == 1:
        extra = float(input("Cuánto dinero desea ingresar -> "))
        saldo += extra
        print(f"Dinero en la cuenta al momento: ${saldo}")
        print()

    elif opcion == 2:
        retiro = float(input("Cuánto dinero desea retirar -> "))
        if retiro > saldo:
            print("Error, no tiene suficiente saldo.")
        else:
            saldo -= retiro
            print(f"Ha retirado ${retiro}. Dinero en la cuenta al momento: ${saldo}")
        print()

    elif opcion == 3:
        print(f"Dinero disponible en la cuenta: ${saldo}")
        print()

    elif opcion == 4:
        print("Gracias por usar el sistema. ¡Hasta luego!")
        break

    else:
        print("Error, se equivocó de opción de menú")
        print()
