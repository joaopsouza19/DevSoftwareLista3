package br.edu.up.exercicios;

import br.edu.up.modelos.LeitorNadador;
import br.edu.up.Prompt;

public class Exercicio21 {
    public void executar() {
        int idade = Prompt.lerInteiro("Informe a idade do nadador: ");

        LeitorNadador nadador = new LeitorNadador(idade);

        nadador.setIdade(idade);

        String categoria = nadador.classificarCategoria();

        Prompt.imprimir("O nadador está na categoria: " + categoria);
    }
}
