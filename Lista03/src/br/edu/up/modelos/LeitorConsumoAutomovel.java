package br.edu.up.modelos;

import br.edu.up.Prompt;

public class LeitorConsumoAutomovel {

    private double distanciaPercorrida;
    private double combustivelGasto;

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    public void lerDistanciaPercorrida() {
        this.distanciaPercorrida = Prompt.lerDecimal("Digite a distância total percorrida pelo automóvel (em km): ");
    }

    public void lerCombustivelGasto() {
        this.combustivelGasto = Prompt.lerDecimal("Digite o total de combustível gasto (em litros): ");
    }
}
