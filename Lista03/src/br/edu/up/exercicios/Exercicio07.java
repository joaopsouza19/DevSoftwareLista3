package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.LeitorCustoFabrica;

public class Exercicio07 {
    public void executar() {
        LeitorCustoFabrica.lerCustoFabrica(); 

        double custoFabrica = LeitorCustoFabrica.getCustoFabrica(); 

        double custoConsumidor = calcularCustoConsumidor(custoFabrica);
        Prompt.imprimir("Custo ao consumidor: " + custoConsumidor);
    }

    public static double calcularCustoConsumidor(double custoFabrica) {
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double custoImpostos = custoFabrica * percentualImpostos;
        double custoComImpostos = custoFabrica + custoImpostos;
        double custoConsumidor = custoComImpostos + (custoComImpostos * percentualDistribuidor);

        return custoConsumidor;
    }
}
