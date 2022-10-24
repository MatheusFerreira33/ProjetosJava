package Objetos.Polimorfismo;

public class jantar {

    public static void main(String [] args){

        Pessoa p = new Pessoa(73.5);

        Arroz a = new Arroz(0.20);

        Feijao f = new Feijao(0.70);

        Sorvete s = new Sorvete(2.70);

        p.comer(a);
        p.comer(f);
        p.comer(s);

        System.out.println("seu peso e " + p.getPeso());


    }
}
