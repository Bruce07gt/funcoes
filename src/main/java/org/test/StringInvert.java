package org.test;

import java.util.Scanner;

public class StringInvert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma palavra para que o programa inverta ela: ");
        String palavra = sc.nextLine();
        String palavraInvertida = "";

        for (int i = palavra.length() -1; i >=0 ; i-- ) {
            palavraInvertida += palavra.charAt(i);
        }
        System.out.println("A palavra invertida e: ");
        System.out.println(palavraInvertida);
    }
}
