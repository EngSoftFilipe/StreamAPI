package StreamAPI;

import java.util.stream.Stream;

public class TesteStream {

        private double celular = 3500.87;
        private double tv = 1500.56;
        private double ps5 = 4500.83;
        private double caneta = 3.87;
    

    public double getCelular(){
        return celular;
    }

    public double getTv(){
        return tv;
    }

    public double getPs5(){
        return ps5;
    }

    public double getCaneta(){
        return caneta;
    }

    public static void main(String[] args) {
        TesteStream loja = new TesteStream();
        
        Stream<Double> produtos = Stream.of(
        loja.getCelular(),
        loja.getTv(),
        loja.getPs5(),
        loja.getCaneta());

        System.out.println("Produtos acima de R$ 1000:");
        produtos.filter(p -> p >= 1000).forEach(p -> System.out.println("R$ " + p));
    }
}
