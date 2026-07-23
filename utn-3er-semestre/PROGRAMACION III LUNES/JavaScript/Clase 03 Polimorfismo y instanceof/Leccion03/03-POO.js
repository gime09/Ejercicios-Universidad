class Empleado {
    constructor(nombre, sueldo) {
      this._nombre = nombre;
      this._sueldo = sueldo;
    }
  
    obtenerDetalle() {
      return `Empleado: nombre: ${this._nombre}, Sueldo: ${this._sueldo}`;
    }
  }
  
  
  class Gerente extends Empleado {
    constructor(nombre, sueldo, departamento) {
      super(nombre, sueldo);
      this._departamento = departamento;
    }
  
    obtenerDetalle() {
      return `${super.obtenerDetalle()}, Departamento: ${this._departamento}`;
    }

  }

  function imprimir(tipo){
    console.log(tipo.obtenerDetalle());
    if(tipo instanceof Gerente){
        console.log("Es un objeto de tipo Gerente");
        console.log(tipo._departamento)
    }
   // else if(tipo instanceof Empleado){  //El orden siempre es jerárquico
   //     console.log("Es de tipo Empleado");

  //  }
   
    else if(tipo instanceof Object){  //El orden siempre es jerárquico
        console.log("Es de tipo Object"); //Clase padre

    }
  }

let gerente1 = new Gerente("Carlos", 5000, "Sistemas");
console.log(gerente1); //  objeto de la clase hija 

let empleado1 = new Empleado("Juan", 3000);
console.log(empleado1);// objeto de la clase padre

imprimir(gerente1);
imprimir(empleado1);

  