mifuncion1();
mifuncion2();

function mifuncion1(){
    console.log("Funcion 1");
}

function mifuncion2(){
    console.log("Function2");
}

//Funcion de tipo Callback
function imprimir(mensaje){
    console.log(mensaje);
    
}
function sumar(op1, op2, funcionCallback){
    let res = op1 + op2;
    funcionCallback(`Resultado: ${res}`);

}

sumar(5, 3, imprimir);

//Llamadas asincronas con uso setTimeout
function miFuncionCallback(){
console.log("Saludo asincrono desdepues de 3 segundos");

}

setTimeout(miFuncionCallback, 3000);  // los segunos se colocan con milisegundos

setTimeout(function(){console.log("Saudo asincrono 2")}, 4000);

setTimeout( () => console.log("Saludos Asincrono 3"), 5000);

let reloj = () => {
    let fecha = new Date();
    console.log(`${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`);
}

setInterval(reloj,1000); // cada 1 segundo se ejecuta

