package AluraJava_3;
import java.util.Scanner;
public class swicth {

    public static void main(String[] args) {

        // argumento do switch int, e cases int

        Scanner chave = new Scanner(System.in);

        System.out.println("digite um numero de 0 a 10, e voce recebera uma mensagem");
        int numero = chave.nextInt();

        switch (numero) {
            case 5:
                System.out.println("voce escolheu 5, parabens");
                break;

            case 10:

                System.out.println("vamo vamo vamo");
                System.out.println("esse numero tem mais mensagem, escolha mais um numero de 1 a 5");

                int numero2 = chave.nextInt();

                switch (numero2) {
                    case 1:
                        System.out.println("oba");
                        break;

                    case 2:
                        System.out.println("legal");
                        break;

                    case 5:
                        System.out.println("daora");
                        break;
                    default:
                        System.out.println("esse numero não tem nenhuma mensagem");
                }
                break;
            case 15:
                System.out.println("Acho que foi criado");
                break;

            case 20:
                System.out.println("ai pai para kkkk");
                break;

            default:
                System.out.println("Esse numero não tem nenhuma mensagem");

        }

    }
    
}
