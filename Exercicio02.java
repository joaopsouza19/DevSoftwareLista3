public class Exercicio02 {
    public static void executar(){
        double dist = Prompt.lerDecimal("Informe a distância total: ");
        double combus = Prompt.lerDecimal("Informe o gasto total do combustível: ");

        double consumo = dist / combus;

        Prompt.imprimir("O consumo do carro na viagem foi " + consumo + " litros");
    }
}
