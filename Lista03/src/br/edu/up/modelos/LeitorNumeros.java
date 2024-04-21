package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorNumeros {
    private int[] numeros;

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public void lerNumeros(int quantidade) {
        setNumeros(ler(quantidade));
    }

    private int[] ler(int quantidade) {
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = Prompt.lerInteiro("Digite o número " + (i + 1) + ": ");
        }
        return numeros;
    }
}

