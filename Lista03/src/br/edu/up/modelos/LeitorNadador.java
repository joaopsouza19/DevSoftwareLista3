package br.edu.up.modelos;

public class LeitorNadador {
    private int idade;

    public LeitorNadador(int idade) {
        this.idade = idade;
    }

    public String classificarCategoria() {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            return "Sênior";
        } else {
            return "Idade fora da faixa etária";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}