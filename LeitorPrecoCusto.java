public class LeitorPrecoCusto {
    public static double lerPrecoCusto() {
        return Prompt.lerDecimal("Digite o preço de custo do produto: ");
    }

    public static double lerPercentualAumento() {
        return Prompt.lerDecimal("Digite o percentual de aumento do preço (%): ");
    }
}
