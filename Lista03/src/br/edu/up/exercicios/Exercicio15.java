package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorCarango;
import br.edu.up.Prompt;

public class Exercicio15 {
    public void executar() {
        double totalDesconto = 0;
        double totalPago = 0;
    
        while (true) {
            String continuar = Prompt.lerLinha("Deseja informar um veículo? (S/N): ");
            if (continuar.equalsIgnoreCase("N")) {
                break;
            } else if (!continuar.equalsIgnoreCase("S")) {
                Prompt.imprimir("Opção inválida. Por favor, informe 'S' para continuar ou 'N' para encerrar.");
                continue;
            }
        
            String combustivel = Prompt.lerLinha("Informe o tipo de combustível (Álcool, Gasolina, Diesel): ");
            combustivel = combustivel.toLowerCase();

            if (combustivel.equals("álcool") || combustivel.equals("alcool") ||
                combustivel.equals("gasolina") || combustivel.equals("diesel")) {
                double valorVeiculo = Prompt.lerDecimal("Informe o valor do veículo (0 para encerrar): ");
                if (valorVeiculo == 0) {
                    break;
                }
    
                LeitorCarango carango = new LeitorCarango(combustivel, valorVeiculo);
                double desconto = carango.calcularDesconto();
                double valorFinal = carango.calcularValorFinal();
    
                if (combustivel.equals("álcool") || combustivel.equals("alcool") || combustivel.equals("gasolina") || combustivel.equals("diesel")) {
                    Prompt.imprimir("Desconto: R$ " + desconto);
                } else {
                    desconto = 0; 
                }
    
                Prompt.imprimir("Valor a ser pago pelo cliente: R$ " + valorFinal);
    
                totalDesconto += desconto;
                totalPago += valorFinal;
            } else {
                Prompt.imprimir("Tipo de combustível inválido. Informe novamente.");
            }
        }
    
        Prompt.imprimir("Total de desconto dado: R$ " + totalDesconto);
        Prompt.imprimir("Total pago pelos clientes: R$ " + totalPago);
    }
}
