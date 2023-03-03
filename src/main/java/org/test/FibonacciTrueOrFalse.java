package org.test;

import java.util.Scanner;

public class FibonacciTrueOrFalse {
    public static void main(String[] args) {
        // definindo o tamanho da sequencia
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Fibonacci true or false");
            System.out.println("2 - Encerrar Programa");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    int n = 10000;

                    int[] fibonacci = new int[n];

                    // preenchendo a sequência
                    fibonacci[0] = 0;
                    fibonacci[1] = 1;
                    for (int i = 2; i < n; i++) {
                        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                    }

                    // solicitando o valor a ser verificado
                    System.out.print("Digite um número para verificar se está na sequência Fibonacci: ");
                    int valor = sc.nextInt();

                    // verificando se o valor está na sequência
                    boolean encontrado = false;
                    for (int i = 0; i < n; i++) {
                        if (valor == fibonacci[i]) {
                            encontrado = true;
                            break;
                        }
                    }


                    // exibindo o resultado da verificação
                    if (encontrado) {
                        System.out.println(valor + " está na sequência Fibonacci.");
                    } else {
                        System.out.println(valor + " não está na sequência Fibonacci.");
                    }
                    break;
                case 2:
                    // Executa a opção 2
                    System.out.println("Programa Encerrado!");
                    System.exit(2);
                    break;

            }
        } while (opcao != 4);
    }
}
