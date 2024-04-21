package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.LerEntrada;

public class Exercicio10 {
    public void executar() {
        LerEntrada.lerQuantidade();

        int quantidadePessoas = LerEntrada.getQuantidade();

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
