package StreamApiDesafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
//Com a Stream API, verifique se todos os números da lista são distintos (não se repetem)
// e exiba o resultado no console.

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6,1, 7, 8, 9, 10, 11);

       boolean temDuplicado= numeros.stream().collect(Collectors.toSet()).size() < numeros.size();

        System.out.println(temDuplicado);
    }
}
