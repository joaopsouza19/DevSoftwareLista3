package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorValorCompra {
    private static double valorCompra;

    public static double getValorCompra() {
        return valorCompra;
    }

    public static void setValorCompra(double valorCompra) {
        LeitorValorCompra.valorCompra = valorCompra;
    }

    public static void lerValorCompra() {
        valorCompra = Prompt.lerDecimal("Digite o valor da compra: ");
    }
}
