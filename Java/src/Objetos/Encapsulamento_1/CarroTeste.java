package Objetos.Encapsulamento_1;

import Objetos.Encapsulamento_2.Carro;
import Objetos.Encapsulamento_2.CarroEspecifico;

public class CarroTeste extends Carro{

    protected CarroTeste(int velocidadeMaxima) {
        super(velocidadeMaxima);
        
    }

    public static void main(String[] agrs) {

        CarroEspecifico c1 = new CarroEspecifico();

        c1.ferrari();


        System.out.println(c1);

    }

}
