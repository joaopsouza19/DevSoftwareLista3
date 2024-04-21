package br.edu.up.modelos;

public class LeitorIndividuo {
    private String nome;
    private char sexo;

    public LeitorIndividuo(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String verificarSexo() {
        if (sexo == 'M' || sexo == 'm') {
            return "Homem";
        } else if (sexo == 'F' || sexo == 'f') {
            return "Mulher";
        } else {
            return "Sexo inválido";
        }
    }
}
