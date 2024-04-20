package br.edu.up.modelos;

import java.util.Scanner;

import br.edu.up.Prompt;

public class LeitorConsumoAutomovel {
    private Scanner scanner;

    public LeitorConsumoAutomovel() {
        scanner = new Scanner(System.in);
    }

    public double lerDistanciaPercorrida() {
        Prompt.imprimir("Digite a distância total percorrida pelo automóvel (em km): ");
        return scanner.nextDouble();
    }

    public double lerCombustivelGasto() {
        Prompt.imprimir("Digite o total de combustível gasto (em litros): ");
        return scanner.nextDouble();
    }
}
