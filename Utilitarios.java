package StreamAPI;

import java.util.function.UnaryOperator;

public class Utilitarios {
    
    public final static UnaryOperator<String> maiuscula = l -> l.toUpperCase(); 
    public final static UnaryOperator<String> primeiraLetra = l -> l.charAt(0) + "";
    public final static String grito (String n){
        return n + " !!! ";
    }

    public final static String calado (String n){
        return n + "SHHH";
    }

    
        
}
