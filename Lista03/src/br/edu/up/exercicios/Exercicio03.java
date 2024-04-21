package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorVendedor;
import br.edu.up.Prompt;

public class Exercicio03 {

    public void executar() {
        LeitorVendedor leitor = new LeitorVendedor();
        leitor.lerDadosVendedor();

        String nomeVendedor = leitor.getNomeVendedor();
        double salarioFixo = leitor.getSalarioFixo();
        double totalVendas = leitor.getTotalVendas();

        double salarioFinal = calcularSalarioFinal(salarioFixo, totalVendas);
        Prompt.imprimir("Nome do vendedor: " + nomeVendedor);
        Prompt.imprimir("Salário fixo: R$ " + salarioFixo);
        Prompt.imprimir("Salário no final do mês: R$ " + salarioFinal);
    }

    public double calcularSalarioFinal(double salarioFixo, double totalVendas) {
        double comissao = 0.15 * totalVendas;
        return salarioFixo + comissao;
    }
}
