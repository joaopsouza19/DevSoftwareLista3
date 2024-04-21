package br.edu.up.modelos;

public class LeitorReajuste {
    private double salario;
    private double salarioMinimo;

    public LeitorReajuste(double salario, double salarioMinimo) {
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularReajuste() {
        if (salario < 3 * salarioMinimo) {
            return salario * 0.5;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            return salario * 0.2;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            return salario * 0.15;
        } else {
            return salario * 0.1;
        }
    }

    public double calcularNovoSalario() {
        return salario + calcularReajuste();
    }
}
