package StreamApiDesafios;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

//Desafio 6 - Verificar se a lista contém algum número maior que 10:
//Utilize a Stream API para verificar se a
// lista contém algum número maior que 10 e exiba o resultado no console.

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        Boolean maiorQueDez = numeros.stream().anyMatch(n -> n > 10);

        System.out.println(maiorQueDez);
    }
}
