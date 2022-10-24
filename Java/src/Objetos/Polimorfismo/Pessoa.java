package Objetos.Polimorfismo;

public class Pessoa {

    private double peso;

    public Double getPeso() {

        return peso;

    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            System.out.println("não foi possivel adcionar esse peso");
        }
    }

    public Pessoa(double peso) {
        setPeso(peso);
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    

    public String toStrig() {
        return "O peso da pessoa é " + getPeso();
    }

}
