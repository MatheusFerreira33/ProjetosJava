package Objetos.heranca;

public class EnumJogo {

    public static void main(String [] args){

        jogador j1 = new jogador();
        j1.x = 10;
        j1.y = 10;

        jogador j2 = new jogador();
        j2.x = 10;
        j2.y = 11;

        j1.atacar(j2);

        System.out.println(j2.vida);






    }

    

    
    
}
