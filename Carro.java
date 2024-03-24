public class Carro {
    private int ano;
    private double valor;

    public Carro(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return valor * 0.12;
        } else {
            return valor * 0.07;
        }
    }
}
