package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorValores {
    private static double cotacaoDolar;
    private static double quantidadeDolar;

    public static double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public static void setCotacaoDolar(double cotacaoDolar) {
        LeitorValores.cotacaoDolar = cotacaoDolar;
    }

    public static double getQuantidadeDolar() {
        return quantidadeDolar;
    }

    public static void setQuantidadeDolar(double quantidadeDolar) {
        LeitorValores.quantidadeDolar = quantidadeDolar;
    }

    public static void lerDados() {
        cotacaoDolar = Prompt.lerDecimal("Digite a cotação do dólar: ");
        quantidadeDolar = Prompt.lerDecimal("Digite a quantidade de dólares disponíveis: ");
    }
}
