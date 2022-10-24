package Objetos.Encapsulamento_2;

public class Carro implements Esportivo{


    public void ligarTurbo(){
        
    }

    public void desligarTurbo(){
        
    }

     private int VELOCIDADE_MAXIMA;
     private int velocidadeAtual;

     protected int getVelocidadeAtual(){
        return velocidadeAtual;
     }

     protected int setVelocidadeMaxima(int velocidadeMaxima){

       return this.VELOCIDADE_MAXIMA = velocidadeMaxima;

     }

     protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;

    }

    protected void acelerar() {

        velocidadeAtual += 5;


    }

    protected void freiar(){

        velocidadeAtual -= 5;

    }

}
