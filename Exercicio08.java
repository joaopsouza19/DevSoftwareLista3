public class Exercicio08 {
    public static void executar() {
        String nomeAluno = LeitorNotas.lerNomeAluno();
        double[] notas = LeitorNotas.lerNotas();

        double media = calcularMedia(notas);
        String mencao = calcularMencao(media);

        Prompt.imprimir("Nome do aluno: " + nomeAluno);
        Prompt.imprimir("Média do aluno: " + media);
        Prompt.imprimir("Menção: " + mencao);
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static String calcularMencao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media < 5.0) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }
}
