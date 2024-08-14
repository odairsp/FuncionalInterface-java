package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Double> dobrar = numero -> numero * 2d;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Double> numerosDobrados = listaNumeros.stream().map(numero -> numero * 2d).toList();

        numerosDobrados.forEach(System.out::println);
    }
}
