package org.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.test.entity.MesFaturamento;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper obj = new ObjectMapper();
        File faturamentoFIle = new File("src/main/resources/dados.json");
        MesFaturamento[] faturamento = obj.readValue(faturamentoFIle, MesFaturamento[].class);


        double menorValor = Double.MAX_VALUE;
        for (MesFaturamento dia : faturamento) {
            if (dia.getValor() < menorValor) {
                menorValor = dia.getValor();
            }
        }
        System.out.println("Menor valor de faturamento diário: " + menorValor);

        // Encontrar o maior valor de faturamento diário
        double maiorValor = Double.MIN_VALUE;
        for (MesFaturamento dia : faturamento) {
            if (dia.getValor() > maiorValor) {
                maiorValor = dia.getValor();
            }
        }
        System.out.println("Maior valor de faturamento diário: " + maiorValor);

        // Calcular a média mensal de faturamento diário
        double somaValores = 0;
        for (MesFaturamento dia : faturamento) {
            somaValores += dia.getValor();
        }
        double mediaMensal = somaValores / faturamento.length;

        // Encontrar o número de dias em que o valor de faturamento diário foi superior à média mensal
        int diasAcimaMedia = 0;
        for (MesFaturamento dia : faturamento) {
            if (dia.getValor() > mediaMensal) {
                diasAcimaMedia++;
            }
        }
        System.out.println("Número de dias em que o valor de faturamento diário foi superior à média mensal: " + diasAcimaMedia);
    }
}
