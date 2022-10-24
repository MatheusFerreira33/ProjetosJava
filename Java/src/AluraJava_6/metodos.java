package AluraJava_6;

import java.util.*;

import javax.swing.JSpinner.NumberEditor;

class metodos {

    int numeros[] = new int[11];

    int operacao4() {

        int i = 1;

        while (i < numeros.length)
            i++;
        return (i);

    }

    int operacao3(int a, int b) {

        return a + b;
    }

    String operacao2() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("modelo");
        int modelo = entrada.nextInt();

        System.out.println("ano");
        int ano = entrada.nextInt();

        if (modelo == ano) {

            return "iguais";

        } else {

            return "não e igual";

        }
    }

    int operacao() {
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;

        }

        return i;
    }

    public static void main(String[] args) {

        metodos a = new metodos();

        // System.out.println(a.operacao());

    }

}
