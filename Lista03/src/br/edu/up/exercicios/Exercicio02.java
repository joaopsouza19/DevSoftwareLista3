package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorConsumoAutomovel;
import br.edu.up.Prompt;

public class Exercicio02 {

    public void executar() {
        LeitorConsumoAutomovel leitor = new LeitorConsumoAutomovel();
        leitor.lerDistanciaPercorrida(); 
        leitor.lerCombustivelGasto(); 

        double consumoMedio = calcularConsumoMedio(leitor.getDistanciaPercorrida(), leitor.getCombustivelGasto());
        Prompt.imprimir("O consumo médio do automóvel é: " + consumoMedio + " km/l");
    }

    public double calcularConsumoMedio(double distanciaPercorrida, double combustivelGasto) {
        return distanciaPercorrida / combustivelGasto;
    }
}
