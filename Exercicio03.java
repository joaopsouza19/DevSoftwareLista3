public class Exercicio03 {
    public static void executar(){
        String nomeVendedor = Prompt.lerLinha("Informe o nome do vendedor: ");
        double salarioVendedor = Prompt.lerDecimal("Informe o salário Fixo do vendedor " + nomeVendedor + ":");
        double vendas = Prompt.lerDecimal("Informe o total de vendas mensal: ");

        double comissao = vendas * 0.15;

        Prompt.imprimir("O vendedor " + nomeVendedor + " tem um salário fixo de: " + salarioVendedor + " e seu salário total será: " + (comissao + salarioVendedor));
    }
}
