package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita uma argumento do tipo T e retorna um resultado do tipo R.
 * É utilizado para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

public class FunctionExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar a Function com expressão lambda para dobrar todos os números.
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os números do Stream e armazená-los em uma lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        //Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
