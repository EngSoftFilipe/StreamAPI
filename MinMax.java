package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Filipe", 7.9, 8.3, 5.8);
        Aluno a2 = new Aluno("Ana", 10.0, 10.0, 10.0);
        Aluno a3 = new Aluno("João", 0, 5,7);
        Aluno a4 = new Aluno("André", 9.7, 8.6, 7.1);
        Aluno a5 = new Aluno("Daniel", 5.9, 6.0, 5.9);
        Aluno a6 = new Aluno("Leonardo", 11.3, 10.1, 20.1);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        Comparator<Aluno> melhorNota = Comparator.comparing(Aluno::getNotas); 
        
        System.out.println(alunos.stream()
        .filter(n -> n.getNotas() <= 10)
        .max(melhorNota).get());

        System.out.println(alunos.stream()
        .filter(n -> n.getNotas() <= 10)
        .min(melhorNota).get());

        // (aluno1, aluno2) -> {
        //     if (aluno1.getNotas() > aluno2.getNotas()) return 1;
        //     if (aluno1.getNotas() < aluno2.getNotas()) return -1;
        //     return 0;
        // };
    }
}
