import br.edu.up.Prompt;

public class Exercicio13 {
    public static void executar() {
        int totalAptos = 0;
        int totalInaptos = 0;

        int n = Prompt.lerInteiro("Digite a quantidade de pessoas: ");

        for (int i = 0; i < n; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i + 1) + ": ");
            String sexo = Prompt.lerLinha("Digite o sexo da pessoa (M/F): ");
            int idade = Prompt.lerInteiro("Digite a idade da pessoa: ");
            String saude = Prompt.lerLinha("Digite a saúde da pessoa (boa/ruim): ");

            boolean apto = (sexo.charAt(0) == 'M' && idade >= 18 && idade <= 25 && saude.equalsIgnoreCase("boa"));

            if (apto) {
                Prompt.imprimir(nome + " está apto para cumprir o serviço militar obrigatório.");
                totalAptos++;
            } else {
                Prompt.imprimir(nome + " não está apto para cumprir o serviço militar obrigatório.");
                totalInaptos++;
            }
        }

        Prompt.linhaEmBranco();
        Prompt.imprimir("Total de pessoas aptas: " + totalAptos);
        Prompt.imprimir("Total de pessoas inaptas: " + totalInaptos);
    }
}
