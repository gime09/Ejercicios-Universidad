
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        /*  System.out.println("Hola mundo desde java"); 
        
        int miVariable = 10 ;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);
        
       //Var - inferencia de tipos en Java (Se puede sólo usar dentro del método main)
       var miVariableEntera2 = 10;
       var miVariableCadena2 = "seguimis estudiando ";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
       //Reglas para definir una variable en Java (se puede susa para comenzar variable $ y _)
        var miVariableEjemplo = 45;*/
 /* var usuario = "osvaldo";
        var titulo = "Ingeniero";
        var union = titulo +" "+ usuario ;
        System.out.println("union =" + union); 
      
      
      var a = 8;
      var b = 4;
      System.out.println(usuario +  (a + b));
      //Ejercicio: Caracteres Especiales con Java
      var nombre = "Natalia";
      System.out.println("\nNueva Linea: \n"+nombre); //salto de linea
      System.out.println("Tabulador: \t" + nombre); //Tabulador un espacio para centrar
      System.out.println("\t\t.:MENÚ:.");
      System.out.println("Retroseso:\b \b"+nombre); // Caracter de retroseso (borra un lugar hacia atras)
     // System.out.println("Comillas simples: \´"+nombre+"\´"); (comillas simple me tira errror)//
      System.out.println("Comillas Dobles:\""+nombre+"\""); */

        //Clase Scanner //creamos objeto dela clase scanner 
        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el título");
        var titulo2 = entrada.nextLine ();
        System.out.println("Resultado: " +titulo2+" "+usuario2); */
 /* byte numEnteroByte = 10; 
        System.out.println("numeroEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte:"+ Byte.MIN_VALUE); //Usamos la clase Byte
        System.out.println("Valor maximo del Byte"+ Byte.MAX_VALUE);
        
        short numEnteroShort = 10;
        System.out.println("numeroEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: " + Short.MIN_VALUE); //Usamos la Clase short
        System.out.println("Valor maximo del Short: " + Short.MAX_VALUE);
     
        int numEnteroInt = 10 ;
        System.out.println("numeroEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int: " + Integer.MIN_VALUE); 
        System.out.println("Valor maximo del int: " + Integer.MAX_VALUE);
     
        
        long numEnteroLong = 10 ;
        System.out.println("numeroEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long: " + Integer.MIN_VALUE); 
        System.out.println("Valor maximo del long: " + Integer.MAX_VALUE);
         */
 /* float numFloat = 10.0F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float:"+ Float.MIN_VALUE);
        System.out.println("El valor maximo del float:"+ Float.MAX_VALUE);
        
        double numDouble = 10;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de double:" + Double.MIN_VALUE);
        System.out.println(" El valor maxio de double:" + Double.MAX_VALUE); */
        //Inferencia de tipos var y tipos primitivos
        /*var numEntero = 20; //Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var  numFloat = 10.0F; // Automaticamente con el punto decimal se transforma en tipo double
        System.out.println("numEntero = " + numFloat);
        var numDouble = 10.0 ;
        System.out.println("numDouble = " + numDouble);*/
        //Tipos Primitivos char
        /* char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);

        char varCaracter = '\u0024'; // Código Unicode correcto
        System.out.println("varCaracter = " + varCaracter);*/
        //Conversion de tipos primitivos 
//       var edad = Integer.parseInt("20"); //convierte cadena a enteros
//        System.out.println("edad = " +(edad + 1));
//        
//        var valorPI = Double. parseDouble("3.1416"); //convierte cadena a Double
//        System.out.println("valorPI = " + valorPI);
        //pedir un valor//Clase Scanner
        /*var entrada = new Scanner(System.in); 
        System.out.println("Digite su edad");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad: = " + edad);*/
        //Coversión de tipos primitivos en Java parte 2  
        /*var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var fraseChar = "programadores".charAt(4); // String no es primitivo, es un objeto
        System.out.println("fraseChar = " + fraseChar);

        System.out.println("Digite un caracter");
        
        // Inicializar el Scanner
       
        fraseChar = entrada.nextLine().charAt(0); 
        System.out.println("fraseChar = " + fraseChar); */
 /*int num1 = 5, num2 = 4;
    var solucion = num1 + num2;
    System.out.println("solución de la  suma= " + solucion);
        
    solucion = num1 - num2;    
    System.out.println("solución de la  resta = " + solucion); 
    
      int num1 = 5, num2 = 4;
        int solucion = num1 * num2;    
        System.out.println("solución de la multiplicación = " + solucion);
        solucion = num1 / num2;   
        System.out.println(" Solución de la división = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println(" Solución2 resultado de la división = " + solucion2);
        
        solucion = num1 % num2; // Guarda el residuo entero de la división
        System.out.println(" solución = " +  solucion); // 5/4 = 1 lo que sobra es residuo
        
        if (num1 % 2 == 0 ) // No incorpora{}porque hay una sola linea de codigo
            System.out.println(" Es un número par");
        else
            System.out.println(" Es un número impar"); 
        
        int varNum1 = 1, varNum2 = 4 ;
        int varNum3 = varNum1 + 6 - varNum2;//Una operación
        System.out.println("varNum3 = " + varNum3 ); 
        
        varNum1 += 1; // varNum1 = varNum1 + 1 ;
        System.out.println("varNum1=" + varNum1);*/
        // seguir con  -= *= /= %=
        /* varNum2 -= 2;
        System.out.println("varNum2 =" + varNum2);
   varNum1 *= 5;
        System.out.println("varNum1 =" +varNum1);
   varNum3 /=4;
        System.out.println("varNum3 =" + varNum3);
   varNum1 %=6;
        System.out.println("varNum1 = " + varNum1);*/
        // Operadores Unarios: Cambio de signo
        /* var varA = 7;
       var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        
    // Operdador de Negación 
    var varC = true ; // Esta literal por default en Jabva es de tipo boolean
    var varD = !varC; // Aquí esta inviertiendo el valor
        System.out.println(" varC = " + varC);
        System.out.println(" varD = " + varD);
                
  // Operadores Unarios de Incremento: Preincremento
  var varE = 9; // se va a modificar su valor
  var varF = ++varE; // simbolo antes de la variable
  //Primero se incrementa la variable y despues se usa su valor
        System.out.println(" varE =" + varE);// se incrementa en la unidad
        System.out.println(" varF =" + varF ); // va a sumar uno 
  
 //Postincremento (el simbolo va después de la variable)
 var varG = 3;
 var varH = varG++;
        System.out.println("varG =" + varG);
        System.out.println(" varH = " + varH);
        
 
// Operadores unarios de decremento
   var varI = 4;
   var varJ = --varI;
        System.out.println(" varI = " + varI); // La variable ya esta con decremento
        System.out.println("varJ =  " + varJ); */
//Postdecremento
/*var vark = 8;
var varL = vark--;// primero el valor de sla variable, luego qeuda el decremento
System.out.println("vark = " + vark); // Imprime 7 // Aquí va a decrementar en uno 
System.out.println("varL = " + varL); // Imprime 8 */
// Operaadores de igualdad y relacionales
      /*  var aNum = 5;
        var bNum = 5;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = (aNum != bNum);
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println(" cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        var gVar = aNum >= bNum; // > >= < <= == !=
        System.out.println(" gVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
            
            
            var edad = 30;
            var adulto = 18;
            if (edad >= adulto){
                System.out.println("Es mayor de edad");
                
            }
            else{
                System.out.println("Es menor de edad");
            }
        } */
      //Operador Condicional And
       /* var valorA = 7;
        var valorMinimo = 0; //rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }

        var vacaciones = false;
        var diaLibre = false;
        if (vacaciones || diaLibre)
            System.out.println("Papá puede asistir al juego de su hijo");
        else
            System.out.println("Papá no puede asistir al jego de si hijo"); */
      
       //Operador Ternario
      /* var resultadoT = (5>4) ? "verdadero" : "falso";
        System.out.println(" resultadoT = " + resultadoT );
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);*/
      
      var x = 5 ; 
      var y = 10;
      var z = ++x + y--;
       System.out.println("x = " + x);
       System.out.println("y = " + y);
       System.out.println("z = " + z);
      
      
    var solucionAritmetica = 4 + 5 * 6 / 3; //4 + ((5*6)/3) = 30 /3 = 10 + 4 =14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
     solucionAritmetica =   (4 + 5) * 6 / 3; // 4 + 5 = 9 *6 = 54 / 3 = 18
        System.out.println(" solucionAritmetica = "+ solucionAritmetica);
     }

}
