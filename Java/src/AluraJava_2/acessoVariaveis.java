package AluraJava_2;

class carro {
    int ano;
    String modelo;
}

public class acessoVariaveis {

    public static void main(String[] args) {
        carro c = new carro();

        c.ano = 2016;
        c.modelo = "Porche";

        //a = new carro();// aqui no "a" não vai funcionar porque ja tem uma variavel
        // que ja esta se referencido

        /*carro a = new carro();*/ //Agora se passar a instancia novamente com uma nova chave vai funcionar mas essa nova chave vai receber retorno vazios, a chave "c" ainda tem acesso.

        /*  c = new carro();
        
        c.ano = 2022;
        c.modelo = "Porche";
        
        c = null;*/

        /*System.out.println(c.ano);
        System.out.println(c.modelo);*/

        // outra maneira de ficar inacessivel.

        if (15 > 10) {
            carro c2 = new carro();
            c2.ano = 2010;

        }
        for (int i = 0; i < 10; i++) {
            carro c3 = new carro();
        }

    }
    

    
/*class B{

}
class A {
    public static void main(String[] args) {
        B b;
        for(int i = 0;i < 10;i++)
            b = new B();
        System.out.println("Finalizando!");
    }
}*/ //Esse codigo tbm funciona

}

    

