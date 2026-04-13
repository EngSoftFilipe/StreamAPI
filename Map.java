package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//import java.util.function.UnaryOperator;

public class Map{
    public static void main(String[] args) {
        
        Consumer<String> println = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Mercedes", "Audi");

        marcas.stream().map(m -> m.toUpperCase()).forEach(println);

        //UnaryOperator<String> maiuscula = l -> l.toUpperCase();
        //UnaryOperator<String> primeiraLetra = l -> l.charAt(0) + "";
        //UnaryOperator<String> grito = l -> l + "!!!";
        
        System.out.println(Utilitarios.maiuscula.andThen(Utilitarios.primeiraLetra).andThen(Utilitarios::grito).apply("Mercedes"));

        System.out.println("\nUsando composição");
        marcas.stream()
        .map(Utilitarios.maiuscula)
        .map(Utilitarios.primeiraLetra)
        .map(Utilitarios::grito)
        .map(Utilitarios::calado)
        .forEach(println);
    }
}