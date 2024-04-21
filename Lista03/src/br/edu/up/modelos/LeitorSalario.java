package br.edu.up.modelos;

public class LeitorSalario {
    private String nome;
    private double salarioAtual;
    private double salarioMinimo;

    public LeitorSalario(String nome, double salarioAtual, double salarioMinimo) {
        this.nome = nome;
        this.salarioAtual = salarioAtual;
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularReajuste() {
        double novoSalario = 0;
        if (salarioAtual < 3 * salarioMinimo) {
            novoSalario = salarioAtual * 1.5;
        } else if (salarioAtual >= 3 * salarioMinimo && salarioAtual <= 10 * salarioMinimo) {
            novoSalario = salarioAtual * 1.2;
        } else if (salarioAtual > 10 * salarioMinimo && salarioAtual <= 20 * salarioMinimo) {
            novoSalario = salarioAtual * 1.15;
        } else {
            novoSalario = salarioAtual * 1.1;
        }
        return novoSalario;
    }

    public double calcularAumentoFolhaPagamento() {
        return calcularReajuste() - salarioAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }
}
