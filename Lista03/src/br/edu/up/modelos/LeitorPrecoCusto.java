package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorPrecoCusto {
    private static double precoCusto;
    private static double percentualAumento;

    public static double getPrecoCusto() {
        return precoCusto;
    }

    public static void setPrecoCusto(double precoCusto) {
        LeitorPrecoCusto.precoCusto = precoCusto;
    }

    public static double getPercentualAumento() {
        return percentualAumento;
    }

    public static void setPercentualAumento(double percentualAumento) {
        LeitorPrecoCusto.percentualAumento = percentualAumento;
    }

    public static void lerDados() {
        precoCusto = Prompt.lerDecimal("Digite o preço de custo do produto: ");
        percentualAumento = Prompt.lerDecimal("Digite o percentual de aumento do preço (%): ");
    }
}
