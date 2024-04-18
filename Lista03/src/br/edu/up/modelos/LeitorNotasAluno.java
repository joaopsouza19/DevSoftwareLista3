package br.edu.up.modelos;

public class LeitorNotasAluno {

    private String nome;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void calculaMedia(double nota1, double nota2, double nota3) {
        media = (nota1 + nota2 + nota3) / 3;
    }
}
