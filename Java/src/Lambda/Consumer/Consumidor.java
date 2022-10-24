package Lambda.Consumer;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import Lambda.predicate.Produto;



public class Consumidor {

    public static void main(String [] args){

        Consumer<Produto> pegarNome = p -> System.out.println(p.nome);// consumer não necessariamente retornar algo
        

        Produto p1 = new Produto("Caneta",12.34, 0.10);
        pegarNome.accept(p1);

        List<Produto> produtos = Arrays.asList(p1);

        produtos.forEach(pegarNome);
        //essa parte tambem vai funcionar
        // se voce fizer a ultima coisa que ta no arquivo produto


    }
    
}
