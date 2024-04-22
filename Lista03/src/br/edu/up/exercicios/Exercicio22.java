package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorLuz;
import br.edu.up.Prompt;

public class Exercicio22 {
    public void executar() {
        int tipoCliente = Prompt.lerInteiro("Informe o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria): ");
        int kwHoraConsumido = Prompt.lerInteiro("Informe a quantidade de KW/h consumidos: ");

        LeitorLuz consumoLuz = new LeitorLuz(tipoCliente);

        consumoLuz.setTipoCliente(tipoCliente);

        double valorConta = consumoLuz.calcularValorConta(kwHoraConsumido);

        Prompt.imprimir("O valor da conta de luz é R$ " + valorConta);
    }
}
