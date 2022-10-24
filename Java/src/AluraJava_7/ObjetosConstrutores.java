package AluraJava_7;

class mae {

    mae(String i) {

        super();
    }

}

class filha extends mae {

    filha() {
        super("...");
        System.out.println();
    }

}

public class ObjetosConstrutores {

    public static void main(String[] args) {

        new filha();

    }

}
