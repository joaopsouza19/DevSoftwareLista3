package br.edu.up.modelos;
import br.edu.up.Prompt;

public class LeitorValorCompra {
    public static double lerValorCompra() {
        return Prompt.lerDecimal("Digite o valor da compra: ");
    }
}
