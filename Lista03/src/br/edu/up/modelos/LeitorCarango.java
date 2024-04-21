package br.edu.up.modelos;

public class LeitorCarango {
    private String combustivel;
    private double valorVeiculo;

    public LeitorCarango(String combustivel, double valorVeiculo) {
        this.combustivel = combustivel;
        this.valorVeiculo = valorVeiculo;
    }

    public double calcularDesconto() {
        if ("Álcool".equalsIgnoreCase(combustivel) || "Alcool".equalsIgnoreCase(combustivel)) {
            return valorVeiculo * 0.25;
        } else if ("Gasolina".equalsIgnoreCase(combustivel)) {
            return valorVeiculo * 0.21;
        } else if ("Diesel".equalsIgnoreCase(combustivel)) {
            return valorVeiculo * 0.14;
        } else {
            return 0; 
        }
    }
    
    public double calcularValorFinal() {
        double desconto = calcularDesconto();
        return valorVeiculo - desconto;
    }
    
    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }
}
