package Lambda.predicate;

import java.util.function.Predicate;

public class predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> prod.preco > 150.00 ;

        // predicate pode ser usado para determinar se uma coisa e false ou não
        // ter o controle de dizer se e falso ou verdadeiro mesmo o fato sendo
        // diferente da decisão final
        // predicate e uma interface funcional utilizado para atribuir uma função lambda
        // ou uma referencia
        // de um metodo
        // Por exemplo predicate tambem serve para determinar se alguma,
        // coisa num determinado valor e caro.

        Produto produto = new Produto("mouseGamer", 200.90, 0.10); // aqui e uma referencia do metodo

        System.out.println(isCaro.test(produto));

        Predicate<Integer> lesser = i -> (i < 18); // função lambda

        Predicate<Integer> test = b -> (3 > 6);

    }

}
