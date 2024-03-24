public class LeitorNotas {
    public static String lerNomeAluno() {
        return Prompt.lerLinha("Digite o nome do aluno: ");
    }

    public static double[] lerNotas() {
        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + ": ");
        }
        return notas;
    }
}
