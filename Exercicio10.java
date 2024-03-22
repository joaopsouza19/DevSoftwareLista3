public class Exercicio10 {
    public static void executar() {
        int quantidadePessoas = Prompt.lerInteiro("Digite a quantidade de pessoas: ");

        for (int i = 0; i < quantidadePessoas; i++) {
            int idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i + 1) + ": ");
            if (idade >= 18) {
                Prompt.imprimir("Maior de idade");
            } else {
                Prompt.imprimir("Menor de idade");
            }
        }
    }
}
