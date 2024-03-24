public class Exercicio03 {
    public static void executar() {
        String nomeVendedor = LeitorVendedor.lerNomeVendedor();
        double salarioFixo = LeitorVendedor.lerSalarioFixo();
        double totalVendas = LeitorVendedor.lerTotalVendas();

        double salarioFinal = calcularSalarioFinal(salarioFixo, totalVendas);
        Prompt.imprimir("Nome do vendedor: " + nomeVendedor);
        Prompt.imprimir("Salário fixo: R$ " + salarioFixo);
        Prompt.imprimir("Salário no final do mês: R$ " + salarioFinal);
    }

    public static double calcularSalarioFinal(double salarioFixo, double totalVendas) {
        double comissao = 0.15 * totalVendas; 
        return salarioFixo + comissao;
    }
}
