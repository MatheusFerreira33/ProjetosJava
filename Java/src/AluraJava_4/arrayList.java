package AluraJava_4;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<String>();// criação

        nomes.add("Matheus");// adcionando coisas
        nomes.add("Ferreira");
        nomes.remove("Matheus");// remove o elemento
        nomes.size();// tamanho do arrayList

        // Object [] nomesComoString = nomes.toArray(); // convertendo para array normal

        // String[] nomes2 = nomes.toArray(new String[0]);// indicando ao metodo toArray
        // especificando o metodo
        // String[] nomes3 = nomes.toArray(new String[nomes.size()]);// 2º maneira de
        // zafer

        /*
         * nomes2[0] = "teste";
         * nomes2[1] = "MAtheus";
         * nomes2[2] = "java";
         */

        // System.out.println(); // contains verifica se tem o valor especificado

        ArrayList<String> paises = new ArrayList<String>();
        paises.add("coreia");
        paises.add("brasil");

        ArrayList<String> tudo = new ArrayList<String>();
        tudo.addAll(nomes);// adciona todos os elementos
        tudo.addAll(paises);

        ArrayList<String> outroNomes = new ArrayList<String>();

        outroNomes.add("vamo");
        outroNomes.set(0, "troco");// o set substitui
        System.out.println(outroNomes.get(0));// pegando um elemento de um arrayList

        /*
         * Os métodos indexOf e lastIndexOf retornam a primeira ou a última posição que
         * possui o elemento desejado. Caso esse elemento não esteja na lista, ele
         * retorna -1:
         */
        /*
         * 
         * ArrayList<String> nomes = new ArrayList<String>();
         * nomes.add("guilherme");
         * nomes.add("mario");
         * nomes.add("paulo");
         * nomes.add("mauricio");
         * nomes.add("adriano");
         * nomes.add("alberto");
         * nomes.add("mario");
         * 
         * System.out.println(nomes.indexOf("guilherme")); // 0
         * System.out.println(nomes.indexOf("mario")); // 1
         * System.out.println(nomes.indexOf("joao")); // -1
         * System.out.println(nomes.lastIndexOf("mario")); // 6
         * System.out.println(nomes.lastIndexOf("joao")); // -1
         * 
         */

    }

}
