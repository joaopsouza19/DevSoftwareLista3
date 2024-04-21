package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorVendedor {
    private String nomeVendedor;
    private double salarioFixo;
    private double totalVendas;

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void lerDadosVendedor() {
        this.nomeVendedor = Prompt.lerLinha("Digite o nome do vendedor: ");
        this.salarioFixo = Prompt.lerDecimal("Digite o salário fixo do vendedor: ");
        this.totalVendas = Prompt.lerDecimal("Digite o total de vendas efetuadas pelo vendedor: ");
    }
}
