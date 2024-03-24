public class Exercicio10 {
    public static void executar() {
        int quantidadePessoas = LerEntrada.lerQuantidade();

        for (int i = 0; i < quantidadePessoas; i++) {
            int idade = LerEntrada.lerIdade(i + 1);
            if (idade >= 18) {
                Prompt.imprimir("Maior de idade");
            } else {
                Prompt.imprimir("Menor de idade");
            }
        }
    }
}