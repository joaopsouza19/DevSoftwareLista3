package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorFuncionario {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public void lerDadosFuncionario() {
        nome = Prompt.lerLinha("Digite o nome do funcionário: ");
        idade = Prompt.lerInteiro("Digite a idade do funcionário: ");
        sexo = Prompt.lerLinha("Digite o sexo do funcionário (M/F): ").toUpperCase().charAt(0);
        salarioFixo = Prompt.lerDecimal("Digite o salário fixo do funcionário: ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
