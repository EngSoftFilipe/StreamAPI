package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        
        // Consumer não retorna nada
        Consumer<Object> MethodReference = System.out::print;

        Stream<String> linguagens = Stream.of("Java \n", "C++ \n", "Python \n", "JS \n");
        linguagens.forEach(MethodReference);



        String[] maisLinguagens = {"Ruby \n", "PHP \n", "C \n", "C#\n"};
        Stream.of(maisLinguagens).forEach(MethodReference);
        Arrays.stream(maisLinguagens, 1, 3).forEach(MethodReference);



        List<String> outrasLinguagens = Arrays.asList("Kotlin \n", "Lua \n", "Swift \n", "Flutter \n");
        outrasLinguagens.stream().forEach(MethodReference);
        outrasLinguagens.parallelStream().forEach(MethodReference);



        //Stream.generate(() -> "Teste \n").forEach(MethodReference);
        //Stream.iterate(0, n -> n + 1).forEach(MethodReference); // Para fazer essa contagem infinita de numeros, tive que mudar o generics do Consumer para Object (Classe padrão do Java)
    }
}
