package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        Consumer<Integer> imprimirPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        listaNumeros.forEach(num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        });

    }
}
