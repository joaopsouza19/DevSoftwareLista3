package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorPessoa;
import br.edu.up.Prompt;

public class Exercicio13 {
    public void executar() {
        int totalAptos = 0;
        int totalHomens = 0;
        int totalMulheres = 0;

        int n = Prompt.lerInteiro("Informe a quantidade de soldados: ");

        for (int i = 0; i < n; i++) {
            String nome = Prompt.lerLinha("Informe o nome do soldado " + (i + 1) + ": ");
            char sexo = Prompt.lerLinha("Informe o sexo (M/F) do soldado " + (i + 1) + ": ").toUpperCase().charAt(0);
            int idade = Prompt.lerInteiro("Informe a idade do soldado " + (i + 1) + ": ");
            boolean saude = Prompt.lerLinha("Informe a saúde do soldado " + (i + 1) + " (S/N): ").equalsIgnoreCase("S");

            LeitorPessoa leitor = new LeitorPessoa(nome, sexo, idade, saude);
            if (leitor.estaAptoServicoMilitar()) {
                Prompt.imprimir("Apto para o serviço militar: Sim");
                totalAptos++;
            } else {
                Prompt.imprimir("Apto para o serviço militar: Não");
            }

            if (sexo == 'M') {
                totalHomens++;
            } else {
                totalMulheres++;
            }
        }

        Prompt.imprimir("Total de soldados aptos para o serviço militar: " + totalAptos);
        Prompt.imprimir("Total de homens: " + totalHomens);
        Prompt.imprimir("Total de mulheres: " + totalMulheres);
    }
}
