package AluraJava_2;
import java.util.*; 
public class CriacaoManipulacaoStringTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        String primeiraLetra = "a";
        String segundaLetra = "b";
        String terceiraLetra = "c";

        System.out.println(" escolha uma letra, e vamos ver se voçe esta com sorte");
        
        System.out.println(primeiraLetra + " " + segundaLetra + " " + terceiraLetra);

        String usuario = entrada.nextLine();

        boolean resultado = segundaLetra.equalsIgnoreCase(usuario);
        


        if (resultado == true) {
            
            System.out.println("Parabens");
            
        } else {
            System.out.println("Voce errou");
        } 


        String s = "estudando para a certificação";
        System.out.println(s.substring(3, 6));
            





    }
    
}
