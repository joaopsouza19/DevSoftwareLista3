public class Exercicio07 {
    public static void executar(){
        double custoFabrica = Prompt.lerDecimal("Digite o custo de fábrica do carro: ");

        double imposto = 0.45;
        double distribuidor = 0.28;

        double impostos = custoFabrica * imposto;
        double custoImpostos = custoFabrica + impostos;
        double custoConsumidor = custoImpostos + (custoImpostos * distribuidor);

        Prompt.imprimir("O custo ao consumidor do carro é: " + custoConsumidor);
    }
}
