package org.test;

import java.util.HashMap;
import java.util.Map;

public class PercentualDist {

    public static void main(String[] args) {

        Map<String, Double> faturamentoMensalPorEstado = new HashMap<>();

        faturamentoMensalPorEstado.put("SP", 67836.43);
        faturamentoMensalPorEstado.put("RJ", 36678.66);
        faturamentoMensalPorEstado.put("MG", 67836.43);
        faturamentoMensalPorEstado.put("ES", 29229.88);
        faturamentoMensalPorEstado.put("Outros", 19849.53);

        //somando todos os valores
        double totalFaturamento = 0;
        for (double valor : faturamentoMensalPorEstado.values()){
            totalFaturamento += valor;
        }

        //criando um mapa do percentual de representacao de cada estado
        Map<String, Double> percentual = new HashMap<>();
        for (Map.Entry<String, Double> entry : faturamentoMensalPorEstado.entrySet()) {
            double valor = entry.getValue();
            double percent = (valor / totalFaturamento) * 100;
            percentual.put(entry.getKey(),percent);
        }

        //resultados
        System.out.println("Percentual de representacao por estado: ");
        for (Map.Entry<String, Double> entry : percentual.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.format("%.2f", entry.getValue()) + "%");
        }
    }
}
