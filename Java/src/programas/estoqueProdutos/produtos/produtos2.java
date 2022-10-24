package programas.estoqueProdutos.produtos;

import java.util.Scanner;

public class produtos2 {

   public static void main(String[] args) {

      Scanner chave = new Scanner(System.in);
      jogosPS4 a = new jogosPS4();

      System.out.println("Qual produto voce deseja vizualizar ?");
      System.out.println("A - GTA V " + " B - Warzone " + "C - Fifa 21");

      String cliente = chave.nextLine();

      switch (cliente) {
         case "A":
            System.out.println(a.gtaV());

            break;

            case "B":
            System.out.println(a.warzone());

            break;

            case "C":
            System.out.println(a.fifa21());

            break;

         default:
            System.out.println("incorreto, voce precisa digitar a letra correspondente, reinicie novamente o programa");
      }

   }

}
