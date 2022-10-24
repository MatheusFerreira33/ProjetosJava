package Objetos.Polimorfismo;

public class Comida {

    private double peso;

    public Comida(double peso) {
        this.peso = peso;
        this.setPeso();
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso() {

        if (peso >= 0) {
            this.peso = peso;
        }

    }
}
