package AluraJava_6;

class A{

    String nome ="teste";

   

       

    
}

class Livro{
    Livro (){

        System.out.println("sem argumentos");
    }

    Livro (String... s){

        System.out.println("strings");
        
    }

    Livro(int i){
        System.out.println("construtor it");
    }


}




public class construtor {

    public static void main(String[] args) {

        Livro l = new Livro(5);

        A a = new A();

        System.out.println(a.nome);
    }

    
}
