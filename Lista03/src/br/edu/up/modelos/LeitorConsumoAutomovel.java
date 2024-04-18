package br.edu.up.modelos;

import java.util.Scanner;

public class LeitorConsumoAutomovel {
    private Scanner scanner;

    public LeitorConsumoAutomovel() {
        scanner = new Scanner(System.in);
    }

    public double lerDistanciaPercorrida() {
        System.out.print("Digite a distância total percorrida pelo automóvel (em km): ");
        return scanner.nextDouble();
    }

    public double lerCombustivelGasto() {
        System.out.print("Digite o total de combustível gasto (em litros): ");
        return scanner.nextDouble();
    }
}
