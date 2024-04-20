package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.LeitorPrecoCusto;

public class Exercicio06 {
    public void executar() {
        double precoCusto = LeitorPrecoCusto.lerPrecoCusto();
        double percentualAumento = LeitorPrecoCusto.lerPercentualAumento();
        double precoVenda = calcularPrecoVenda(precoCusto, percentualAumento);
        Prompt.imprimir("O preço de venda do produto é: " + precoVenda);
    }

    public static double calcularPrecoVenda(double precoCusto, double percentualAumento) {
        double aumento = precoCusto * (percentualAumento / 100);
        return precoCusto + aumento;
    }
}