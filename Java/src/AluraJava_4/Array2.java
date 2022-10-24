package AluraJava_4;

import AluraJava_7.referencia;

public class Array2 {

    public static void main(String[] args) {

        /*
         * int x[] = new int[3];
         * 
         * for (x[1] = x.length - 1; x[1]>=0; x[1]--) {
         * 
         * 
         * x[x[1]] = -5;
         * 
         * 
         * 
         * System.out.println(x[1]);
         * }
         */

            String Funcionario[] = new String[3];

            Funcionario[0] = "Matheus";
            Funcionario[1] = "Ferreira";

        String referencia[] = (String[]) Funcionario; // referencia

        Funcionario[1] = "outro nome";

        //System.out.println(referencia[1]);


            String teste[] = new String [2];
            teste[0] = "certificação";
            teste[1] = "java";

            String s = teste[1];//Para referenciar um determinado valor armazenado em um
            //array, usa-se o nome do array seguido do índice entre
            //colchetes

            Object vals[]=(Object[]) teste; // isso aqui e uma referencia de um array ja existente
            //Object vals[] = new Object[2];// criação de um novo array
            vals[1] = "PHP";

            //System.out.println(vals[1].equals(teste[1]));
            //System.out.println(teste[1]);

            conta c = new conta();

            c.Metodoint();
            

            //System.out.println();
    }


}

class conta{

      void Metodoint() {
    int numeros[] = new int[]{1,2,3,4,5,6,7,8,9,10,11};

    
        for(int i = 0; i <= numeros.length; i++){

            numeros[i] = i*5;
           System.out.println(numeros[i]);

        }
        

    }



}
