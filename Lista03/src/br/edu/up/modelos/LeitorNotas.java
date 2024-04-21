package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorNotas {
    private String nomeAluno;
    private double[] notas;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void lerDados() {
        setNomeAluno(Prompt.lerLinha("Digite o nome do aluno: "));
        setNotas(lerNotas());
    }

    private double[] lerNotas() {
        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + ": ");
        }
        return notas;
    }
}
