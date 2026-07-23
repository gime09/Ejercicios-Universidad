

function miFuncion(){
    console.log("Saludos desde mi función")
}

miFuncion();

let myFuncion = function (){
    console.log("Saludos desde la funcion anonima")
}



//Ahora vamos a crear una función flecha
let miFuncionFlecha = ()=> {
    console.log("Saludos desde mi función flecha")
}

//Hay mas variantes para funciones flechas que vamos a ir viendo
miFuncionFlecha();

//los hacemos en una línea 
const Saludar = () => console.log("Saludos a todos desde esta función flecha");
Saludar();

//otro ejemplo
const Saludar2 = () =>{
    return "Saludos desde la función flecha dos"
}

console.log(Saludar2);

//Simplificamos la función anterior
const saludar3= () =>"Saludos desde la función flecha tres";
console.log(saludar3)

//Continuamos con otro ejemplo
const regresaObjeto = () => ({nombre: "Juan", apellido: "Lara"});

console.log(regresaObjeto());

//Funciones flechas que reciben parámetros 
const funcionParametros = (mensaje) => console.log(mensaje);
funcionParametros("saludos desde esta función con parámetros");

//Una función clásica
const funcionParametrosClasica = function(mensaje){
    console.log(mensaje);
}
funcionParametrosClasica("Saludos desde la función clásica");

//Se pueden omitir los parénteses en la función flecha de la siguiente manera
const funcionConParametros = mensaje => console.log(mensaje)

funcionConParametros("Otra forma de trabajar con función flecha");

//Ahora vemos funciones flechas con varios parámetros
//Podemos abrir la funcion y tener mas cosas dentro de ella
const funcionConParametros2 = (op1, op2) => {
   let resultado = op1 + op2;
  return resultado
}
console.log(funcionConParametros2(3, 5));