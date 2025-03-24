package com.example;

public class ValueOfDemo {
    public static void main(String[] args) {
        // this program requires two
        // arguments on the command line

        String[] myArgs =new String[2]; //cree este array para ver probar con los valores
        myArgs[0] = "13.4";
        myArgs[1] = "66.1";

        if (myArgs.length == 2) {     //Tengo que verificar q args tenga dos elementos, y no que verifique si tiene 3 como estaba antes
            // convert strings to numbers float
            float a = (Float.valueOf(myArgs[0])).floatValue();    // tuve q cambiar .value(No exisite ese metodo para Float) a .valueOf
            float b = (Float.valueOf(myArgs[1])).floatValue ();   //en vez de .float tenia que ser .floatValue
            // do some arithmetic
            System.out.println("a + b = " +
            (a + b));
            System.out.println("a - b = " +
            (a - b));
            System.out.println("a * b = " +
            (a * b));
            System.out.println("a / b = " +
            (a / b));
            System.out.println("a % b = " +
            (a % b));
        
        } else {
        System.out.println("This program " +
        "requires two command-line arguments.");
        }


        //Version si quiero que lea como string y los haga a int

        myArgs[0] = "13";   
        myArgs[1] = "66";

        if (myArgs.length == 2) {     //Tengo que verificar q args tenga dos elementos, y no que verifique si tiene 3 como estaba antes
            // convert strings to numbers int
            int a = (Integer.parseInt(myArgs[0]));   //Cambie la clase y los metodos necesarios para hacer el casteo
            int b = (Integer.parseInt(myArgs[1]));   //Cambie la clase y los metodos necesarios para hacer el casteo
            // do some arithmetic
            System.out.println("a + b = " +
            (a + b));
            System.out.println("a - b = " +
            (a - b));
            System.out.println("a * b = " +
            (a * b));
            System.out.println("a / b = " +
            (a / b));
            System.out.println("a % b = " +
            (a % b));
        
        } else {
        System.out.println("This program " +
        "requires two command-line arguments.");
        }



    }
}
/*
 1) Verificar que funciona correctamente e indicar cuál es la salida cuando se invoca con
 parámetros 13.4 y 66.1
 2) ¿cómo debería modificarse el código si los parámetros de línea de comando fueran
 solamente enteros positivos?
*/