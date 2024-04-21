package br.edu.up.modelos;

public class LeitorContas {
    private double precoCusto;
    private double precoVenda;

    public LeitorContas(double precoCusto, double precoVenda) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String calcularResultado() {
        if (precoVenda > precoCusto) {
            return "Lucro";
        } else if (precoVenda < precoCusto) {
            return "Prejuízo";
        } else {
            return "Empate";
        }
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}
