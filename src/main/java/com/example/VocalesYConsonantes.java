package com.example;


public class VocalesYConsonantes {

    public enum Vocales{
        a, A, e, E, i, I, o, O, u, U;
    }
    
    public void CuantasConsonantesYCuantasVocales(String string){
        int vocalCounter = 0;
        int consonanteCounter = 0;

        for (int counter = 0; counter < string.length(); counter++) {
            char letra = string.charAt(counter);
            
            switch (letra) {
                case 'a': 
                case 'A':
                case 'e': 
                case 'E':
                case 'i': 
                case 'I':
                case 'o': 
                case 'O':
                case 'u': 
                case 'U':
                    vocalCounter++;
                    break;
                default:
                    // Si es letra y no es vocal, es consonante
                    if (Character.isLetter(letra)) {
                        consonanteCounter++;
                    }
                    break;
            }
        }
        System.out.println("Hay "+ vocalCounter+" vocales.\n" + "Hay"+ consonanteCounter +"consonantes." );
    }
}