package AluraJava_4;

class DeclaracaoArrays {

    int[] nomeArray1;
    Double[] nomeArray2;
    long[] nomeArray3;
    Short[] nomeArray4;
    Float[] nomeArray5;
    String[] nomeArray6;
}

public class Array {

    public static void main(String[] args) {

        DeclaracaoArrays a = new DeclaracaoArrays();

        a.nomeArray1 = new int[20];
        a.nomeArray1[0] = 5;

        String teste[] = new String[3];
        teste = new String[]{"a","b"};

        int teste2[] = new int [5];
        teste2 = new int[] {1,2,3,4,5,6};


        int x[] = new int[0];
        x = new int []{0,3,5};

        int y[] = new int[3];

        System.out.println(y.length);

        

        for (int i = 10; i < a.nomeArray1.length; i++) {

            String nome = "12.0";
            Double convertido = Double.parseDouble(nome);
            a.nomeArray1[i] = i;
            System.out.println(a.nomeArray1[i]);

        }

        //System.out.println(teste2.length);

    }

}
