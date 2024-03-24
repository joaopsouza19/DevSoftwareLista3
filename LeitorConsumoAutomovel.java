public class LeitorConsumoAutomovel {
    public static double lerDistanciaPercorrida() {
        return Prompt.lerDecimal("Digite a distância total percorrida pelo automóvel (em km): ");
    }

    public static double lerCombustivelGasto() {
        return Prompt.lerDecimal("Digite o total de combustível gasto (em litros): ");
    }
}
