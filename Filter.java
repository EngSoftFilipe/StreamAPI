package StreamAPI;

import java.util.stream.Stream;

public class Filter {
   
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Filipe", 7.9, 8.3, 5.8);
        Aluno a2 = new Aluno("Ana", 10.0, 10.0, 10.0);
        Aluno a3 = new Aluno("João", 0, 5,7);
        Aluno a4 = new Aluno("André", 9.7, 8.6, 7.1);
        Aluno a5 = new Aluno("Daniel", 5.9, 6.0, 5.9);
        Aluno a6 = new Aluno("Leonardo", 11.3, 10.1, 20.1);

        Stream <Aluno> notas = Stream.of(a1, a2, a3, a4, a5, a6);
        notas
        .filter(media -> media.getNotas() >= 6)
        .filter(notaMaxima -> notaMaxima.getNotas() <= 10)
        .map(a -> a.getNome() + " - " + String.format("%.1f", a.getNotas()) + " - Parabéns!")
        .forEach(System.out::println);
        
    }
}