package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorPessoa2 {
    private String nome;
    private String sexo;
    private double altura;
    private int idade;

    public LeitorPessoa2() {
        this.nome = Prompt.lerLinha("Digite o nome: ");
        this.sexo = Prompt.lerLinha("Digite o sexo (M - Masculino, F - Feminino): ");
        this.altura = Prompt.lerDecimal("Digite a altura (em metros): ");
        this.idade = Prompt.lerInteiro("Digite a idade: ");
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }
}


