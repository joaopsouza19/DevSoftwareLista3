package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorNotasAluno;
import br.edu.up.Prompt;

public class Exercicio01 {

    public void executar() {
        LeitorNotasAluno aluno = new LeitorNotasAluno();
        aluno.setNome("João Pedro");

        aluno.calculaMedia(9.0, 6.5, 5.4);

        Prompt.imprimir("Nome: " + aluno.getNome());
        Prompt.imprimir("Média: " + aluno.getMedia());
    }
}
