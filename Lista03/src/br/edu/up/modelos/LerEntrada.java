package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LerEntrada {
    private static int quantidade;

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        LerEntrada.quantidade = quantidade;
    }

    public static void lerQuantidade() {
        setQuantidade(Prompt.lerInteiro("Digite a quantidade de pessoas: "));
    }

    public static int lerIdade(int numeroPessoa) {
        return Prompt.lerInteiro("Digite a idade da pessoa " + numeroPessoa + ": ");
    }
}
