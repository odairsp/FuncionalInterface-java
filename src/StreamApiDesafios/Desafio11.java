package StreamApiDesafios;

import java.util.Arrays;
import java.util.List;

//Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
//Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 5);

        Integer somaQuadrados = numeros.stream().map(n->n*n).reduce(0,Integer::sum);

        System.out.println("Soma dos quadrados: "+somaQuadrados);

    }
}
