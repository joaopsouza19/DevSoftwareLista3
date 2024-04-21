package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.LeitorTriangulo;

public class Exercicio19 {
    public void executar() {
        LeitorTriangulo triangulo = new LeitorTriangulo();

        int lado1 = Prompt.lerInteiro("Informe o comprimento do lado 1: ");
        triangulo.setLado1(lado1);

        int lado2 = Prompt.lerInteiro("Informe o comprimento do lado 2: ");
        triangulo.setLado2(lado2);

        int lado3 = Prompt.lerInteiro("Informe o comprimento do lado 3: ");
        triangulo.setLado3(lado3);

        String tipoTriangulo = triangulo.verificarTriangulo();

        Prompt.imprimir("Os lados informados formam um triângulo " + tipoTriangulo);
    }
}

