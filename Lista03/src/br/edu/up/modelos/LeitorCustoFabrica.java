package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorCustoFabrica {
    private static double custoFabrica;

    public static double getCustoFabrica() {
        return custoFabrica;
    }

    public static void setCustoFabrica(double custoFabrica) {
        LeitorCustoFabrica.custoFabrica = custoFabrica;
    }

    public static void lerCustoFabrica() {
        custoFabrica = Prompt.lerDecimal("Digite o custo de fábrica do carro: ");
    }
}
