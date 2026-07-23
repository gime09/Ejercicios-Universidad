import psycopg2  # Esto es para conectarnos a Postgre

try:
    conexion = psycopg2.connect(
        host="127.0.0.1",
        database="test_bd",
        user="postgres",
        password="admin",
        port="5432"
    )
    print("Conexión exitosa a la base de datos")

    cursor = conexion.cursor()
    sentencia = "SELECT * FROM persona"
    cursor.execute(sentencia) # De esta manera ejecutamos la sentencia
    registros = cursor.fetchall() # Recuperamos todos los registros que serán una lista
    print(registros)

    cursor.close()
    conexion.close()

except Exception as e:
    print("Ocurrió un error al conectar a la base de datos:")
    print(e)
