public class Exercicio09 {
    public static void executar(){
        int numerosDentro = 0;

        for (int i = 0; i < 80; i++) {
            int numeros = Prompt.lerInteiro("Digite um número: ");
            if (numeros >= 10 && numeros <= 150) {
                numerosDentro++;
            }
        }

        Prompt.imprimir("Quantidade de números no intervalo entre 10 e 150: " + numerosDentro);
    }
}
