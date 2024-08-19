package StreamApiDesafios;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

//Desafio 5 - Calcule a média dos números maiores que 5:
//Com a Stream API, calcule a média dos números maiores que 5
// e exiba o resultado no console.

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,111,112,181);



        Integer primo = numeros.stream()
                .filter(n -> n>1)
                .filter(n -> verificaPrimo(n)).toList().getLast();

        System.out.println(primo);


    }
    static boolean verificaPrimo(Integer n){
        {
            for (int i = 2;i*i<=n;i++) {
                return !(n % i == 0);
            }
            return true;
        }
    }
}
