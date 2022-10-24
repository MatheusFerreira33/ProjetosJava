package AluraJava_2;

import AluraJava_5.teste;

class texto{

    String nome = "Matheus";
    String nome2 = "matheus";
}

class texto2{

    String nome = "Matheus";


    static String  teste(){
    
        return " ";
    }
    
}




public class verificacao {

    public static void main(String [] args){

        texto t = new texto();
        texto2 t2 = new texto2();

        System.out.println(t.nome.equalsIgnoreCase(t2.nome));
   
        System.out.println(new teste());
   
   
    }



    
}
