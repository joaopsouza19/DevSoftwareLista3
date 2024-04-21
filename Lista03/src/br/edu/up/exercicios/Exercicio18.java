package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorFuncionario;
import br.edu.up.Prompt;

public class Exercicio18 {
    public void executar() {
        double totalAumentoFolha = 0;

        while (true) {
            LeitorFuncionario leitor = new LeitorFuncionario();
            leitor.lerDadosFuncionario();

            String nome = leitor.getNome();
            int idade = leitor.getIdade();
            char sexo = leitor.getSexo();
            double salarioFixo = leitor.getSalarioFixo();

            double abono = 0;
            if (sexo == 'M' && idade >= 30) {
                abono = 100;
            } else if (sexo == 'M' && idade < 30) {
                abono = 50;
            } else if (sexo == 'F' && idade >= 30) {
                abono = 200;
            } else if (sexo == 'F' && idade < 30) {
                abono = 80;
            } else {
                System.out.println("Sexo inválido. Abono será zero.");
            }

            double salarioLiquido = salarioFixo + abono;

            Prompt.linhaEmBranco();
            Prompt.imprimir("Nome do funcionário: " + nome);
            Prompt.imprimir("Salário líquido: R$ " + salarioLiquido);

            totalAumentoFolha += salarioLiquido - salarioFixo;

            String continuar = Prompt.lerLinha("Deseja cadastrar outro funcionário? (S/N): ");
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        Prompt.imprimir("Total de aumento na folha de pagamento: R$ " + totalAumentoFolha);
    }
}
