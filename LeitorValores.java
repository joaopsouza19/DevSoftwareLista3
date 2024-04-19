import br.edu.up.Prompt;

public class LeitorValores {
    public static double lerCotacaoDolar() {
        return Prompt.lerDecimal("Digite a cotação do dólar: ");
    }

    public static double lerQuantidadeDolar() {
        return Prompt.lerDecimal("Digite a quantidade de dólares disponíveis: ");
    }
}
