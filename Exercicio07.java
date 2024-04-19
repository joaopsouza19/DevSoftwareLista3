import br.edu.up.Prompt;

public class Exercicio07 {
    public static void executar() {
        double custoFabrica = LeitorCustoFabrica.lerCustoFabrica();
        double custoConsumidor = calcularCustoConsumidor(custoFabrica);
        Prompt.imprimir("Custo ao consumidor: " + custoConsumidor);
    }

    public static double calcularCustoConsumidor(double custoFabrica) {
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double custoImpostos = custoFabrica * percentualImpostos;
        double custoComImpostos = custoFabrica + custoImpostos;
        double custoConsumidor = custoComImpostos + (custoComImpostos * percentualDistribuidor);

        return custoConsumidor;
    }
}
