package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorPessoa2;
import br.edu.up.Prompt;

public class Exercicio23 {
    public void executar() {
        LeitorPessoa2 leitor = new LeitorPessoa2();
        double pesoIdeal = calcularPesoIdeal(leitor);

        Prompt.linhaEmBranco();
        Prompt.imprimir("Nome: " + leitor.getNome());
        Prompt.imprimir("Peso ideal: " + pesoIdeal);
    }

    private double calcularPesoIdeal(LeitorPessoa2 pessoa) {
        double pesoIdeal = 0;

        if (pessoa.getSexo().equalsIgnoreCase("M")) {
            if (pessoa.getAltura() > 1.70) {
                if (pessoa.getIdade() <= 20) {
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 58;
                } else if (pessoa.getIdade() >= 21 && pessoa.getIdade() <= 39) {
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 53;
                } else {
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 45;
                }
            } else {
                if (pessoa.getIdade() < 40) {
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 50;
                } else {
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 58;
                }
            }
        } else if (pessoa.getSexo().equalsIgnoreCase("F")) {
            if (pessoa.getAltura() > 1.50) {
                pesoIdeal = (62.1 * pessoa.getAltura()) - 44.7;
            } else if (pessoa.getAltura() <= 1.50) {
                if (pessoa.getIdade() >= 35) {
                    pesoIdeal = (62.1 * pessoa.getAltura()) - 45;
                } else {
                    pesoIdeal = (62.1 * pessoa.getAltura()) - 49;
                }
            }
        } else {
            System.out.println("Sexo inválido.");
        }

        return pesoIdeal;
    }
}
