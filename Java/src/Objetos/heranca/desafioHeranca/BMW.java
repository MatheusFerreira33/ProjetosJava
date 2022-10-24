package Objetos.heranca.desafioHeranca;

public class BMW extends Carro {

    BMW(  ) {
        super(212);
    }

    void acelerar() {
        super.velocidadeAtual += 100;
        super.acelerar();

    }

    void freiar() {
        super.freiar();
    }

    public String toString() {
        return "Velocidade Atual e " + velocidadeAtual + "Km/h.";
    }

}
