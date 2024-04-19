import br.edu.up.Prompt;

public class Exercicio06 {
    public static void executar() {
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
