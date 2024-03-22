public class Exercicio08 {
    public static void executar(){
        String nome = Prompt.lerLinha("Digite o nome do aluno: ");
        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");

        double media = (nota1 + nota2 + nota3) / 3;

        String resultado;
        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media <= 5) {
            resultado = "Reprovado";
        } else {
            resultado = "Recuperação";
        }

        Prompt.imprimir("Nome do aluno: " + nome);
        Prompt.imprimir("Média: " + media);
        Prompt.imprimir("Resultado: " + resultado);
    }
}   
