public class Exercicio06 {
    public static void executar() {
        double custo = Prompt.lerDecimal("Digite o preço de custo do produto: ");
        double acrescimo = Prompt.lerDecimal("Digite o percentual de acréscimo: ");

        double venda = custo * (1 + acrescimo / 100);

        Prompt.imprimir("O preço de venda do produto é: " + venda);
    }
}