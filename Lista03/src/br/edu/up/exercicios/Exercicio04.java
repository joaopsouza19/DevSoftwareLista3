package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.LeitorValores;

public class Exercicio04 {
    public void executar() {
        LeitorValores.lerDados(); 

        double cotacaoDolar = LeitorValores.getCotacaoDolar(); 
        double quantidadeDolar = LeitorValores.getQuantidadeDolar(); 

        double valorEmReal = calcularValorEmReal(cotacaoDolar, quantidadeDolar);
        Prompt.imprimir("O valor em reais é: R$ " + valorEmReal);
    }

    private static double calcularValorEmReal(double cotacaoDolar, double quantidadeDolar) {
        return cotacaoDolar * quantidadeDolar;
    }
}
