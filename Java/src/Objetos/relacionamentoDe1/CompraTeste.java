package Objetos.relacionamentoDe1;

import java.util.Scanner;
import java.util.ArrayList;


public class CompraTeste {

    public static void main(String [] argss){

        
        Scanner info = new Scanner(System.in);
        compra c = new compra();
        

        System.out.println("qual produto voce pegou?");
        String produto = info.nextLine();
        
        System.out.println("quantos voce pegou?");
        int quantidadeCliente = info.nextInt();

        System.out.println("preco de cada?");
        double precoCliente = info.nextDouble();

    

        //item i = new item(produto,quantidadeCliente,precoCliente);

       //c.itens.add(new item(produto,quantidadeCliente,precoCliente));

       //System.out.println(i.precoFinal(quantidadeCliente, precoCliente));
        
    
   
    }
    
}
