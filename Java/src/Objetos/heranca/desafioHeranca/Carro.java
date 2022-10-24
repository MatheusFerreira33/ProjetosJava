package Objetos.heranca.desafioHeranca;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;

    }

    void acelerar() {

        if (velocidadeAtual >= VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += 5;
        }
    }

    void freiar() {

        if (velocidadeAtual >= 5) {
            this.velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }

    }

}
