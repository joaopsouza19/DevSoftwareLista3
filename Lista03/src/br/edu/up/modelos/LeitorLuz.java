package br.edu.up.modelos;

public class LeitorLuz {
    private int tipoCliente;
    private double valorKwHora;

    public LeitorLuz(int tipoCliente) {
        this.tipoCliente = tipoCliente;
        switch (tipoCliente) {
            case 1:
                this.valorKwHora = 0.602;
                break;
            case 2:
                this.valorKwHora = 0.483;
                break;
            case 3:
                this.valorKwHora = 1.29;
                break;
            default:
                this.valorKwHora = 0.0;
                break;
        }
    }

    public double calcularValorConta(int kwHoraConsumido) {
        return this.valorKwHora * kwHoraConsumido;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getValorKwHora() {
        return valorKwHora;
    }

    public void setValorKwHora(double valorKwHora) {
        this.valorKwHora = valorKwHora;
    }
}
