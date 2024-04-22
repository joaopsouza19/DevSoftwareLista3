package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorMedia;
import br.edu.up.Prompt;

public class Exercicio24 {
    public void executar() {
        double notaLaboratorio = Prompt.lerDecimal("Informe a nota do trabalho de laboratório: ");
        double notaAvaliacaoSemestral = Prompt.lerDecimal("Informe a nota da avaliação semestral: ");
        double notaExameFinal = Prompt.lerDecimal("Informe a nota do exame final: ");

        LeitorMedia leitor = new LeitorMedia(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
        double mediaFinal = leitor.calcularMediaFinal();

        Prompt.imprimir("A média final do estudante é: " + mediaFinal);
    }
}
