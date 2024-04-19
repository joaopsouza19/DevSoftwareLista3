package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorVendedor {

    public static String lerNomeVendedor() {
        return Prompt.lerLinha("Digite o nome do vendedor: ");
    }

    public static double lerSalarioFixo() {
        return Prompt.lerDecimal("Digite o salário fixo do vendedor: ");
    }

    public static double lerTotalVendas() {
        return Prompt.lerDecimal("Digite o total de vendas efetuadas pelo vendedor: ");
    }
}
