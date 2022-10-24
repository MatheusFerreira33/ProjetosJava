package Lambda.function;

import java.util.function.Function;

public class Funcao {

    public static void main(String [] args){

        /*  O function recebe dois parametros genericos
            o primeiro e o que ele vai receber e o segundo e o que vai retornar
            

        */
        Function<Integer,String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
                                                // essa parte se ler " se o modulo 2 for
                                                // igual a 0 vai retornar par ou impa aocontrario"

       System.out.println(parOuImpar.apply(33));

    }

}
