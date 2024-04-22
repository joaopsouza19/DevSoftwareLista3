package br.edu.up.modelos;

public class LeitorProfessor {
    private int nivel;
    private double valorHoraAula;

    public LeitorProfessor(int nivel) {
        this.nivel = nivel;
        switch (nivel) {
            case 1:
                this.valorHoraAula = 12.0;
                break;
            case 2:
                this.valorHoraAula = 17.0;
                break;
            case 3:
                this.valorHoraAula = 25.0;
                break;
            default:
                this.valorHoraAula = 0.0;
                break;
        }
    }

    public double calcularSalario(int horasAula) {
        return this.valorHoraAula * horasAula;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
