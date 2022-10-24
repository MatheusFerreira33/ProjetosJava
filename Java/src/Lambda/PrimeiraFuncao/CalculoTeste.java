
package Lambda.PrimeiraFuncao;

public class CalculoTeste {

    public static void main(String[] args) {

        calculo s = new somar(); // aqui nesse calculo pego do tipo mais generico
        
        s = new multiplicador();

        System.out.println(s.calc(2, 2));


        System.out.println(s.calc(2, 3));
        
    }

}

