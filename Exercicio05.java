public class Exercicio05 {
    public static void executar(){
        double valorCompra = Prompt.lerDecimal("Informe o valor da compra: ");

        Prompt.imprimir("O valor da prestação fica: " + (valorCompra / 5));
    }
}
