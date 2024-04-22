package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorPretendente;
import br.edu.up.Prompt;

public class Exercicio26 {
    public void executar() {
        LeitorPretendente leitor = new LeitorPretendente();

        String nome = leitor.getNome();
        int idade = leitor.getIdade();
        int grupoRisco = leitor.getGrupoRisco();

        String categoria = calcularCategoria(idade, grupoRisco);

        Prompt.linhaEmBranco();
        Prompt.imprimir("Nome do pretendente: " + nome);
        Prompt.imprimir("Idade: " + idade);
        Prompt.imprimir("Categoria: " + categoria);
    }

    private String calcularCategoria(int idade, int grupoRisco) {
        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case 1:
                    return "Baixo";
                case 2:
                    return "Médio";
                case 3:
                    return "Alto";
                default:
                    return "Pessoa não enquadrada em nenhuma categoria";
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case 2:
                    return "Médio";
                case 3:
                    return "Alto";
                case 4:
                    return "Alto";
                default:
                    return "Pessoa não enquadrada em nenhuma categoria";
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case 3:
                    return "Alto";
                case 4:
                    return "Alto";
                case 5:
                    return "Alto";
                default:
                    return "Pessoa não enquadrada em nenhuma categoria";
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case 4:
                    return "Alto";
                case 5:
                    return "Alto";
                case 6:
                    return "Alto";
                default:
                    return "Pessoa não enquadrada em nenhuma categoria";
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case 7:
                    return "Alto";
                case 8:
                    return "Alto";
                case 9:
                    return "Alto";
                default:
                    return "Pessoa não enquadrada em nenhuma categoria";
            }
        } else {
            return "Pessoa não enquadrada em nenhuma categoria";
        }
    }
}
