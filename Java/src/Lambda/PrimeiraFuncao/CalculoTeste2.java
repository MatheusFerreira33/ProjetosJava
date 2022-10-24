package Lambda.PrimeiraFuncao;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

    public static void main(String [] args){

        BinaryOperator <Double> calc = (a,b) -> { return a * b; }; // isso e uma função lambda
        System.out.println(calc.apply(2.0,3.0));
        
    }
    
}

