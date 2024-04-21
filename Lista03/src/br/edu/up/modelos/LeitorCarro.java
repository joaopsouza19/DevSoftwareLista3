package br.edu.up.modelos;

public class LeitorCarro {
    private int ano;
    private double valor;

    public LeitorCarro(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return valor * 0.12;
        } else {
            return valor * 0.07;
        }
    }
}

