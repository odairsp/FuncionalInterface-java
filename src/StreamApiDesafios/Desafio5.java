package StreamApiDesafios;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

//Desafio 5 - Calcule a média dos números maiores que 5:
//Com a Stream API, calcule a média dos números maiores que 5
// e exiba o resultado no console.

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double media = numeros.stream()
                .filter(n -> n > 5)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElseThrow(()-> new NoSuchElementException("Não foi possível realizar a média!"));

        System.out.println("Média dos números maiores que 5 é: "+media);


    }
}
