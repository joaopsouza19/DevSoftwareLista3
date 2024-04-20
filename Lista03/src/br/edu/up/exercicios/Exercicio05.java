package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.LeitorValorCompra;

public class Exercicio05 {
    public void executar() {
        double valorCompra = LeitorValorCompra.lerValorCompra();
        int numeroPrestacoes = 5;

        double valorPrestacao = calcularValorPrestacao(valorCompra, numeroPrestacoes);
        Prompt.imprimir("O valor de cada prestação é: " + valorPrestacao);
    }

    //
    public static double calcularValorPrestacao(double valorCompra, int numeroPrestacoes) {
        return valorCompra / numeroPrestacoes;
    }
}
