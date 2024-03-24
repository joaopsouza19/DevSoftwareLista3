public class Exercicio09 {
    public static void executar() {
        int quantidade = 80;
        int[] numeros = LeitorNumeros.lerNumeros(quantidade);

        int contador = 0;
        for (int numero : numeros) {
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        Prompt.imprimir("Quantidade de números no intervalo entre 10 e 150 (inclusive): " + contador);
    }
}
