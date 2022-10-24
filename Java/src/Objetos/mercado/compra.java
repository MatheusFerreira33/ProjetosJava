package Objetos.mercado;

import java.util.List;
import java.util.ArrayList;

public class compra {

    List<item> itens = new ArrayList<>();

    void adcionarItem(produto p,int quantidade){

        this.itens.add(new item(p,quantidade));

    }

    double obterValortotal(){
        double total = 0;

        for(item item : itens){

            total += item.quantidade * item.produto.precoProduto;
            
        }

        return total;
    }



    
}
