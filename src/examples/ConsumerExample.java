package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };
        // Usar o Consumer para imprimir números pares no Stream
        listaNumeros.forEach(num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        });
        // com Predicate (filter), function reference
        listaNumeros.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }
}
