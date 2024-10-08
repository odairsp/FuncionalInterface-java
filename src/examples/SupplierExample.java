package examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saldacao = () -> "Consegui fazer!";

        List<String> listaSaudacoes = Stream.generate(saldacao).limit(5L).toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
