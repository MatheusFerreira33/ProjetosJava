package programas.Notas;

import java.util.Scanner;

public class notas {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas voce quer informar ?"); 
        int numeroInformado = entrada.nextInt();

        double notas[] = new double[numeroInformado];

        for(int i = 0; i < notas.length; i++){

            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

        }

        double total = 0;
        for(double nota : notas){
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A media e "  + media + "!");

        entrada.close();

        

        
    }
    
}
