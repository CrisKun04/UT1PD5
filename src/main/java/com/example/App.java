package com.example;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println(Animales.Animalesdisponibles.values());    Esto me da un error, pq java no sabe como imptimir esto.
        System.out.println(java.util.Arrays.toString(Animales.Animalesdisponibles.values()));
        //puedo hacer esto para que java imprima los nombres de los objetos en forma de string y no en fomra de como que si fueran un objeto 

        VocalesYConsonantes vocalesYConsonantes = new VocalesYConsonantes();
        vocalesYConsonantes.CuantasConsonantesYCuantasVocales("solo");

        

    
        String original = "este es el curso de Programación 2";
        StringBuilder result = new StringBuilder("hola");
        int index = original.indexOf('a');                                  //"eola"    "este es el curso de Programación 2"
        /*1*/ result.setCharAt(0, original.charAt(0));                      // eola         "este es el curso de Programación 2"
        System.out.println(result);

        /*2*/ result.setCharAt(1, original.charAt(original.length()-1));    // e2la      "este es el curso de Programación 2"
        System.out.println(result);

        /*3*/ result.insert(1, original.charAt(4));                         // e la        "este es el curso de Programación 2"
        System.out.println(result);

        /*4*/ result.append(original.substring(1,4));                       // e laeste        "este es el curso de Programación 2"
        System.out.println(result);

        /*5*/ result.insert(3, (original.substring(index/*25*/, index+2/*27*/) + " ")); // e laeste      "este es el curso de Programación 2"
        System.out.println(result);
    }
}
