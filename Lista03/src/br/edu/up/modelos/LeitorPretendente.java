package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorPretendente {
    private String nome;
    private int idade;
    private int grupoRisco;

    public LeitorPretendente() {
        this.nome = Prompt.lerLinha("Digite o nome do pretendente: ");
        this.idade = Prompt.lerInteiro("Digite a idade do pretendente: ");
        this.grupoRisco = Prompt.lerInteiro("Digite o grupo de risco (1 - baixo, 2 - médio, 3 - alto): ");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getGrupoRisco() {
        return grupoRisco;
    }
}
