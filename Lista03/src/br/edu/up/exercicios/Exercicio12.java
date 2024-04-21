package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.LeitorCarro;

public class Exercicio12 {
    public void executar() {
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            int ano = Prompt.lerInteiro("Informe o ano do veículo: ");
            double valorOriginal = Prompt.lerDecimal("Informe o valor original do veículo: ");

            LeitorCarro carango = new LeitorCarro(ano, valorOriginal);

            double desconto = carango.calcularDesconto();
            double valorFinal = valorOriginal - desconto;

            Prompt.imprimir("Desconto: R$ " + desconto);
            Prompt.imprimir("Valor a ser pago pelo cliente: R$ " + valorFinal);

            if (ano <= 2000) {
                totalCarrosAte2000++;
            }
            totalGeral++;

            continuar = Prompt.lerLinha("Deseja continuar calculando desconto? (S/N)").charAt(0);
        }

        Prompt.imprimir("Total de carros até 2000: " + totalCarrosAte2000);
        Prompt.imprimir("Total geral de carros: " + totalGeral);
    }
}
