
package Lambda.PrimeiraFuncao;

@FunctionalInterface // isso aqui e uma interface com apenas uma unica função 
// esse tipo de interface e usado para fazer as funções lambdas 

public interface calculo {

    double calc (double a, double b);

    default String s (String a, String b){
        return "";
    }

    default String legal(){ // esse metodo default pode 
        return "0";
    }

    static String daora(){ // esse tambem 
        return "daora";
    }
    
}

