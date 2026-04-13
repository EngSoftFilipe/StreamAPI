package StreamAPI;

import java.util.stream.Stream;

public class FilterMap {
    public static void main(String[] args){
        
        Stream<String> palavras = Stream.of("Java", "Flutter", "TypeScript", "C++");
        
        palavras
        .filter(t -> t.length() > 4)
        .map(s -> s.toUpperCase())
        .forEach(System.out::println);

        Stream<Integer> numeros = Stream.of(3,1,7,4,6,5,8,10,9);
        
        numeros
        .filter(t -> t >= 1)
        .map(t -> t * 2)
        .map(t -> t - 6)
        .filter(t -> t > 0)
        .forEach(System.out::println);
    }
}