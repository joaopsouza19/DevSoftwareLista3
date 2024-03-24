public class Exercicio01 {
    public static void executar() {
        String nomeAluno = LeitorNotasAluno.lerNomeAluno();
        double[] notas = LeitorNotasAluno.lerNotas();

        double media = calcularMedia(notas);
        Prompt.imprimir("Nome do aluno: " + nomeAluno);
        Prompt.imprimir("Média do aluno: " + media);
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
