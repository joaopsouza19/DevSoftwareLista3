public class LeitorNumeros {
    public static int[] lerNumeros(int quantidade) {
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = Prompt.lerInteiro("Digite o número " + (i + 1) + ": ");
        }
        return numeros;
    }
}
