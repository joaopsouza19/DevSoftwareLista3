package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorReajuste;
import br.edu.up.Prompt;

public class Exercicio16 {
    public void executar() {
        double totalReajuste = 0;
        double totalNovosSalarios = 0;
        int totalFuncionarios = 584;

        double salarioMinimo = Prompt.lerDecimal("Informe o valor do salário mínimo: ");

        for (int i = 0; i < totalFuncionarios; i++) {
            double salario = Prompt.lerDecimal("Informe o salário do funcionário " + (i + 1) + ": ");

            LeitorReajuste reajuste = new LeitorReajuste(salario, salario);
            reajuste.setSalario(salario);
            reajuste.setSalarioMinimo(salarioMinimo);

            double reajusteCalculado = reajuste.calcularReajuste();
            double novoSalario = reajuste.calcularNovoSalario();

            Prompt.imprimir("Reajuste do funcionário " + (i + 1) + ": R$ " + reajusteCalculado);
            Prompt.imprimir("Novo salário do funcionário " + (i + 1) + ": R$ " + novoSalario);

            totalReajuste += reajusteCalculado;
            totalNovosSalarios += novoSalario;
        }

        Prompt.imprimir("Total de reajuste dado: R$ " + totalReajuste);
        Prompt.imprimir("Total de salários após reajuste: R$ " + totalNovosSalarios);
    }
}
