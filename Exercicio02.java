public class Exercicio02 {
    public static void executar() {
        double distanciaPercorrida = LeitorConsumoAutomovel.lerDistanciaPercorrida();
        double combustivelGasto = LeitorConsumoAutomovel.lerCombustivelGasto();

        double consumoMedio = calcularConsumoMedio(distanciaPercorrida, combustivelGasto);
        Prompt.imprimir("O consumo médio do automóvel é: " + consumoMedio + " km/l");
    }

    public static double calcularConsumoMedio(double distanciaPercorrida, double combustivelGasto) {
        return distanciaPercorrida / combustivelGasto;
    }
}
