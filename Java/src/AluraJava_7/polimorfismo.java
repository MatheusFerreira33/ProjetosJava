package AluraJava_7;

class veiculo {

    public void ligar() {
        System.out.println("veiculo esta sendo ligado");
    }
}

class carro extends veiculo {

    /*
     * ublic void ligar(){
     * System.out.println("veiculo esta sendo ");
     * }
     */
}
/*
 * com polimorfismo voce consegue trabalhar sem mesmo o que vai ser executado de
 * verdade
 * voce puxa um metodo, e ele que vai preocurar qual metodo dever ser chamado
 * primeiro
 */

public class polimorfismo {

    public static void main(String[] args) {

        veiculo v = new carro();
        // carro c = new carro();

        v.ligar();// aqui ele faz a reencrita

    }

}
