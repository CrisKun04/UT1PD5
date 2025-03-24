package com.example;
    //Dado el siguiente código:
public class ToStringDemo {
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits " +
        "before decimal point.");               
        System.out.println( (s.length() - dot - 1) +
        " digits after decimal point.");        
    }
}

/*
 1) Indicar cuál es la salida obtenida al ejecutarlo.
 2) Indicar por qué se imprime cada uno de los datos y la razón de su forma
*/    

/*
 1)
 Output --> 3 digits before decimal point.
 Output --> 2 digits after decimal point.
*/

/*
 2)
 Primeramente, por uso de la interpolacion, me deja trabajar con nombres de variables pero que en vez de ser en forma de string, se imprime el valor de la variable
 tmb con interpolacion se pueden hacer operaciones aritmetricas o uso de metodos para hacer operaciones.
 Segundo, en los system.out.println(); no va a hacer salto de line si se hace solo un enter para abajo, se tiene q usar esto --> n/
*/