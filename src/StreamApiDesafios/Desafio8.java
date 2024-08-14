package StreamApiDesafios;



//Desafio 8 - Somar os dígitos de todos os números da lista:
//Utilizando a Stream API, realize a soma dos dígitos de todos os
// números da lista e exiba o resultado no console.


import java.util.Arrays;
import java.util.List;


public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

       int somaDigitos = numeros.stream().mapToInt(n ->
                String.valueOf(Math.abs(n))
                        .chars()
                        .map(Character::getNumericValue).sum()).sum();
        System.out.println(somaDigitos);
    }
}
