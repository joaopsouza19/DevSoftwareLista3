package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorConsumoAutomovel;

public class Exercicio02 {

    public void executar() {
        LeitorConsumoAutomovel leitor = new LeitorConsumoAutomovel();
        double distanciaPercorrida = leitor.lerDistanciaPercorrida();
        double combustivelGasto = leitor.lerCombustivelGasto();

        double consumoMedio = calcularConsumoMedio(distanciaPercorrida, combustivelGasto);
        System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");
    }

    public double calcularConsumoMedio(double distanciaPercorrida, double combustivelGasto) {
        return distanciaPercorrida / combustivelGasto;
    }
}
