package Objetos.relacionamentoDe1;


class teste{

    String teste = "sei la";
}


public class item {

    String nomeProduto;
    int quantidade;
    double preco;

    item(String nomeProduto, int quantidade, double preco){

        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    double precoFinal(int quantidade, double preco){

       double total =  this.quantidade * this.preco;

       return total;
        
    }

   
    
}


