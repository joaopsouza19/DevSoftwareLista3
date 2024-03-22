public class Exercicio04 {
    public static void executar(){
        double cot = Prompt.lerDecimal("Informe a cotação atual do dolar: ");
        double dol = Prompt.lerDecimal("Informe quantos dolares possui: ");
 
        double conv = dol * cot;
 
        Prompt.imprimir("O valor de " + dol + " dolares em reais ficam R$" + conv);
     }
}
