package com.aula;

import java.text.Normalizer;

public class ValidadorPalindromo {
    public static boolean verificaPalindromo(String palavra) {

        String frase = Normalizer.normalize(palavra, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                .replaceAll(" ", "")
                .replaceAll("[^a-zA-Z]", "")
                .toLowerCase();
                
        System.out.printf("A palavra %s", frase);

        StringBuilder str = new StringBuilder(frase);
        str.reverse();

        boolean resul = frase.equals(str.toString());

        if (resul == true) {
            System.out.println("\nIs a PALINDROMOOOO");
            return resul;
        } else {
            System.out.println("\nIs not a palindromo!");
            return resul;
        }

    }

    public static void main(String[] args) {

        System.out.println(verificaPalindromo("teste e"));
    }
}
