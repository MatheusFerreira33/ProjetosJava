package Lambda.predicate;

import java.util.function.Consumer;

public class Produto extends Object {

    public final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {

        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;

    }

   /*  public void forEach(Consumer<Produto> pegarNome) {
    }*/

}
