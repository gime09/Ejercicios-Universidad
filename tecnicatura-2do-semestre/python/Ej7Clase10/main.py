# Inicializamos una lista para almacenar las horas trabajadas de las 5 personas
horas_trabajadas = []

# Solicitamos las horas trabajadas para cada persona
for i in range(5):
    horas = float(input(f"Ingrese las horas trabajadas por la persona {i+1}: "))
    horas_trabajadas.append(horas)

# Solicitamos la tarifa de pago
tarifa_pago = float(input("Ingrese la tarifa de pago por hora: "))

# Inicializamos una lista para almacenar los salarios y una variable para la sumatoria de los salarios
salarios = []
sumatoria_salarios = 0

# Calculamos el salario de cada persona y sumamos al total
for horas in horas_trabajadas:
    salario = horas * tarifa_pago
    salarios.append(salario)
    sumatoria_salarios += salario

# Imprimimos los resultados
for i, salario in enumerate(salarios):
    print(f"El salario de la persona {i+1} es: {salario}")

print(f"La sumatoria de todos los salarios es: {sumatoria_salarios}")




