import br.edu.up.Prompt;

public class LeitorCustoFabrica {
    public static double lerCustoFabrica() {
        return Prompt.lerDecimal("Digite o custo de fábrica do carro: ");
    }
}
