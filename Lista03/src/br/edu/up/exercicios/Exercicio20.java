package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorProfessor;
import br.edu.up.Prompt;

public class Exercicio20 {
    public void executar() {
        int nivel = Prompt.lerInteiro("Informe o nível do professor (1, 2 ou 3): ");
        int horasAula = Prompt.lerInteiro("Informe a quantidade de horas/aula dadas pelo professor: ");

        LeitorProfessor professor = new LeitorProfessor(nivel);
        professor.setNivel(nivel);

        double valorHoraAula = professor.getValorHoraAula();

        double salario = valorHoraAula * horasAula;

        Prompt.imprimir("O salário do professor é R$ " + salario);
    }
}
