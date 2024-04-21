package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.LeitorIndividuo;

public class Exercicio11 {
    public void executar(){
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < 56; i++) {
            String nome = Prompt.lerLinha("Informe o nome da pessoa " + (i + 1) + ": ");
            char sexo = Prompt.lerLinha("Informe o sexo (M/F) da pessoa " + (i + 1) + ": ").charAt(0);

            LeitorIndividuo individuo = new LeitorIndividuo(nome, sexo);
            individuo.setNome(nome);
            individuo.setSexo(sexo);

            String nomeIndividuo = individuo.getNome();
            String mensagem = individuo.verificarSexo();
            Prompt.imprimir("Pessoa " + (i + 1) + ": " + nomeIndividuo + " - " + mensagem);

            if (mensagem.equals("Homem")) {
                totalHomens++;
            } else if (mensagem.equals("Mulher")) {
                totalMulheres++;
            }
        }

        Prompt.imprimir("Total de homens: " + totalHomens);
        Prompt.imprimir("Total de mulheres: " + totalMulheres);
    }
}
