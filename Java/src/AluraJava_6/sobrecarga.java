package AluraJava_6;


class Teste {
    public void metodo(int i) {
    }

    void metodo(Object o) {
        System.out.println("object");
    }
    void metodo() {
        System.out.println("string");
    }
}


/*class Teste {
    public int metodo() {}
    protected double metodo() {} não compila
}*/

public class sobrecarga {

    public static void main(String[] args) {

        new Teste().metodo("");
    
    
        
    }
    
}
