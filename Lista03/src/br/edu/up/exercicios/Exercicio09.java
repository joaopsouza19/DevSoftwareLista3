package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.LeitorNumeros;

public class Exercicio09 {
    public void executar() {
        LeitorNumeros leitor = new LeitorNumeros();
        int quantidade = 80;
        leitor.lerNumeros(quantidade);

        int[] numeros = leitor.getNumeros();

        int contador = contarNumerosNoIntervalo(numeros, 10, 150);

        Prompt.imprimir("Quantidade de números no intervalo entre 10 e 150 (inclusive): " + contador);
    }

    public static int contarNumerosNoIntervalo(int[] numeros, int min, int max) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero >= min && numero <= max) {
                contador++;
            }
        }
        return contador;
    }
}
