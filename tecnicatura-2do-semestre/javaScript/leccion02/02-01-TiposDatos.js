// Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios es igaul a Java
*/
var nombre = "Gimena"; //Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(nombre);

var numero = 3000; //Tipo Numérico
console.log( numero); 

var objeto = {

nombre : "Gimena",
apellido : "Gauna",
telefono : "156301728"

}
console.log(typeof objeto);

//Tipos de dato boolean (se lo conoce como bandera)
var bandera = true;
console.log(bandera);

//Tipos de dato funcion
function miFuncion(){}
console.log( typeof mifuncion);

//Tipo de datos funcion (symbol)
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase (es una funcion)
class persona {

    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(persona);

//Tipos de datos undefined ( Este dato recibe una variable cuando no esta inicializada o no se le a asignado un valor)
var x ;
console.log(x);

x=undefined;
console.log(x);

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object 
console.log(typeof y );

//Tipo de dato array y Empty String
var autos = ["Citroen", "Audi","BMW","Ford"];
console.log(autos);
console.log(typeof autos); //pregunta que tipo de dato es: object

var z = " ";
console.log(z); // Es una cadena vacia



