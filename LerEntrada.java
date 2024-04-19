import br.edu.up.Prompt;

public class LerEntrada {
    public static int lerQuantidade() {
        return Prompt.lerInteiro("Digite a quantidade de pessoas: ");
    }

    public static int lerIdade(int numeroPessoa) {
        return Prompt.lerInteiro("Digite a idade da pessoa " + numeroPessoa + ": ");
    }
}
