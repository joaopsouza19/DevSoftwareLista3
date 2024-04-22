package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorClassificacao;
import br.edu.up.Prompt;

public class Exercicio25 {
    public void executar() {
        String nomeEstudante = Prompt.lerLinha("Informe o nome do estudante: ");
        int numeroMatricula = Prompt.lerInteiro("Informe o número de matrícula do estudante: ");
        double notaLaboratorio = Prompt.lerDecimal("Informe a nota do trabalho de laboratório: ");
        double notaAvaliacaoSemestral = Prompt.lerDecimal("Informe a nota da avaliação semestral: ");
        double notaExameFinal = Prompt.lerDecimal("Informe a nota do exame final: ");

        LeitorClassificacao classificacao = new LeitorClassificacao(nomeEstudante, numeroMatricula, notaLaboratorio,
                notaAvaliacaoSemestral, notaExameFinal);
        classificacao.imprimirInformacoes();
    }
}
