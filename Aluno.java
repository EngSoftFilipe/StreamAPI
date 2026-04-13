package StreamAPI;

public class Aluno {

    final String nome;
    final double NOTA1, NOTA2, NOTA3;

    public Aluno(String nome, double NOTA1, double NOTA2, double NOTA3){
        this.nome = nome;
        this.NOTA1 = NOTA1;
        this.NOTA2 = NOTA2;
        this.NOTA3 = NOTA3;
    }

     public String getNome(){
        return nome;
    }

     public double getNotas(){
        return (NOTA1 + NOTA2 + NOTA3) / 3;
    }

}
