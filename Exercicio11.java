import br.edu.up.Prompt;

public class Exercicio11 {
    public static void executar() {
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < 56; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i + 1) + ": ");
            char sexo = lerSexo("Digite o sexo da pessoa (M/F): ");

            if (sexo == 'M' || sexo == 'm') {
                Prompt.imprimir(nome + " é homem.");
                totalHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                Prompt.imprimir(nome + " é mulher.");
                totalMulheres++;
            } else {
                Prompt.imprimir("Sexo inválido. Digite M ou F.");
                i--; 
            }
        }

        Prompt.linhaEmBranco();
        Prompt.imprimir("Total de homens: " + totalHomens);
        Prompt.imprimir("Total de mulheres: " + totalMulheres);
    }

    public static char lerSexo(String mensagem) {
        char sexo;
        do {
            sexo = Prompt.lerLinha(mensagem).toUpperCase().charAt(0);
        } while (sexo != 'M' && sexo != 'F');
        return sexo;
    }
}
