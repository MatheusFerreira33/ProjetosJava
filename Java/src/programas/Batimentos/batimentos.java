package programas.Batimentos;

import java.util.Scanner;

class HeartRates {

    public String nome;
    public String sobrenome;
    public int idade;

    HeartRates(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;

    }

///////////////////////////////////////////////////////

  /* public String getnome(){
        return this.nome;

    }

    public void  setnome(){
        
    } 

///////////////////////////////////////////////////////

    public String getsobrenome(){
        return this.sobrenome;
    }

    public void  setsobrenome(){
        
    } 

///////////////////////////////////////////////////////////



    public int getidade(){
        return this.idade;
    }

    public void  setidade(){
        
    } */


    public int calculo(){

        final int frequencia = 220;

        int soma = frequencia - idade;

        return soma;

        
    }

}




public class batimentos {

    public static void main(String[] args) {

    HeartRates a = new HeartRates("Matheus","Ferreira",21);

    Scanner entrada = new Scanner(System.in);

    
        
       
        System.out.println("Digite o seu nome");
        a.nome = entrada.next();

        System.out.println("Digite o seu Sobrenome");
        a.sobrenome = entrada.next();

        System.out.println("Digite a sua idade");
        a.idade = entrada.nextInt();

        System.out.print("Frequencia de batimentos cardiocos e " + a.calculo());

        entrada.close();
        

    }

}
