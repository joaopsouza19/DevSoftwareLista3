package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.LeitorNotas;

public class Exercicio08 {
    public void executar() {
        LeitorNotas leitor = new LeitorNotas();
        leitor.lerDados(); 

        String nomeAluno = leitor.getNomeAluno();
        double[] notas = leitor.getNotas();

        double media = calcularMedia(notas);
        String mencao = calcularMencao(media);

        Prompt.imprimir("Nome do aluno: " + nomeAluno);
        Prompt.imprimir("Média do aluno: " + media);
        Prompt.imprimir("Menção: " + mencao);
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static String calcularMencao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media < 5.0) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }
}
