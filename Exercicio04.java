public class Exercicio04 {
    public static void executar(){
        double cotacao = Prompt.lerDecimal("Informe a cotação atual do dolar: ");
        double dolar = Prompt.lerDecimal("Informe quantos dolares possui: ");
 
        double conversao = dolar * cotacao;
 
        Prompt.imprimir("O valor de " + dolar + " dolares em reais ficam R$" + conversao);
     }
}
