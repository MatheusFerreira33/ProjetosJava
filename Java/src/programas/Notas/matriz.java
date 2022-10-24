package programas.Notas;

import java.util.Scanner;;

public class matriz {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos?");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Quantos notas por  alunos?");
        int qtdeNotas= entrada.nextInt();

        double notasDaTurma [][] = new double[qtdeAlunos][qtdeNotas];

        double total = 0;

        for(int a = 0; a < notasDaTurma.length; a++){

            for (int n = 0; n < notasDaTurma[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d:",n,a);
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Media da turma e " + media);

        entrada.close();


    }
    
}
