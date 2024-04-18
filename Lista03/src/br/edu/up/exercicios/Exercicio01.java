package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorNotasAluno;

public class Exercicio01 {

    public void executar() {
        LeitorNotasAluno aluno = new LeitorNotasAluno();
        aluno.setNome("João Pedro");

        aluno.calculaMedia(9.0, 6.5, 5.4);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Média: " + aluno.getMedia());
    }
}
