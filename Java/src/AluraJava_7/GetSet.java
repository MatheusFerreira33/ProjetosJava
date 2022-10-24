package AluraJava_7;

import java.util.Scanner;

class operacao {

    Scanner b = new Scanner(System.in);

    String metodo() {

        System.out.println("Digite um numero de 0 a 8?");
        int contador = b.nextInt();

        if (contador > 5) {
            return ("foi foi bibibi");
        } else {
            return ("jojojo foi aqui");
        }

    }

}

class teste3 {

    int h = 15;

    public int incremento() {

        return h++;
    }
}

class teste4 extends teste3 {

    public String incremento2() {

        int j = 20;

        if (j == h++) {
            return "blz agora ta igual";
        } else {
            return "ainda não ta igual";
        }

    }

}

class teste2 {

    private double numeroConta;
    private double saldo;

    public double setnumeroConta() {

        Scanner dado = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta");
        numeroConta = dado.nextDouble();

        return this.numeroConta = numeroConta;

    }

}

class teste {

    private String nome;
    private int idade;

    public String getnome() {

        return this.nome = nome;

    }

}

public class GetSet {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        operacao a = new operacao();
        teste2 b = new teste2();
        teste3 c = new teste3();
        teste4 d = new teste4();

        for (int i = 0; i < 6; i++) {

            System.out.println(c.incremento());
            System.out.println(d.incremento2());

        }
        System.out.println(b.setnumeroConta());

        System.out.println("Digite um numero de 0 a 10 ?");
        int numero = entrada.nextInt();

        if (numero > 6) {

            System.out.println(a.metodo());
        } else {
            System.out.println("Não puxou");
        }

    }

}
