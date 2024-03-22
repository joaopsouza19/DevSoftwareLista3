public class Exercicio01 {

    public static void executar(){

        String nomeAluno = Prompt.lerLinha("Digite o nome do aluno: ");

        double nota1 = Prompt.lerDecimal("Digite a nota da primeira prova: ");
        double nota2 = Prompt.lerDecimal("Digite a nota da segunda prova: ");
        double nota3 = Prompt.lerDecimal("Digite a nota da terceira prova: ");

        double media = (nota1 + nota2 + nota3) / 3;

        Prompt.linhaEmBranco();
        Prompt.imprimir("Nome do aluno: " + nomeAluno);
        Prompt.imprimir("Média: " + media);
    }
}
