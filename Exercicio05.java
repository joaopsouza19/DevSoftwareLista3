import br.edu.up.Prompt;

public class Exercicio05 {
    public static void executar() {
        double valorCompra = LeitorValorCompra.lerValorCompra();
        int numeroPrestacoes = 5; 

        double valorPrestacao = calcularValorPrestacao(valorCompra, numeroPrestacoes);
        Prompt.imprimir("O valor de cada prestação é: " + valorPrestacao);
    }

    public static double calcularValorPrestacao(double valorCompra, int numeroPrestacoes) {
        return valorCompra / numeroPrestacoes;
    }
}
