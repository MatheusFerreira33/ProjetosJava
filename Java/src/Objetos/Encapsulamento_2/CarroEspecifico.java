package Objetos.Encapsulamento_2;

public class CarroEspecifico extends Carro {

    public CarroEspecifico() {
        super(200);
    }

    public void ferrari() {

        super.getVelocidadeAtual();
        super.acelerar();
        

    }


    public String toString() {

        return "Sua velocidade e " + getVelocidadeAtual() + " " + setVelocidadeMaxima(300);
    }

}
