public class Exercicio04 {
    public static void executar() {
        double cotacaoDolar = LeitorValores.lerCotacaoDolar();
        double quantidadeDolar = LeitorValores.lerQuantidadeDolar();

        double valorEmReal = calcularValorEmReal(cotacaoDolar, quantidadeDolar);
        Prompt.imprimir("O valor em reais é: R$ " + valorEmReal);
    }

    private static double calcularValorEmReal(double cotacaoDolar, double quantidadeDolar) {
        return cotacaoDolar * quantidadeDolar;
    }
}
