package Lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    /*
     * O forEach e uma função do metodo for que e executado em lambda
     * tambem serve para usar menos codigos
     */

    class pratica {

        pratica() {
            List<String> aprovados = Arrays.asList("Mat", "Fer", "Sil");

            System.out.println("Forma Tradicional");

            for (String nome2 : aprovados) {
                System.out.println(nome2);
            }

            System.out.println("\nLambda #01...");

            aprovados.forEach((nome2) -> {
                System.out.println(nome2 + "???");
            });

        }

    }

    public static void main(String[] args) {

        Foreach f = new Foreach();

        List<String> aprovados = Arrays.asList("Ana", "Lisa", "Gui");

        System.out.println("Forma Tradicional ");

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");

        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!!");
        });

        //System.out.println(f.pratica());

    }

}
