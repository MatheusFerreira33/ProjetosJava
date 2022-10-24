package AluraJava_9;

public class Wrappers {


    public static void main(String [] args){

        // um wrappers e um tipo de objeto que representa um tipo primitivo

        /* 
        * boolean = Boolean
        * byte = Byte
        * short = Short
        * int = Integer
        * char = Character
        * long = Long
        * double = Double
        * float = Float
        */

        Double d1 = new Double(22.5); // tipo wrappers do tipo Double
        Double d2 = new Double("22.45"); // todos os wrappers tem esses 2 tipo de construtores



        Character c = new Character('a'); // esse wrappers so tem esse tipo de construtor

        Boolean b1 = new Boolean(true); // wrappers de booleans padrão
        Boolean b2 = new Boolean("true"); // valido
        Boolean b3 = new Boolean("TrUe"); // valido
        Boolean b4 = new Boolean(false);// valido com o valor false
        Boolean b5 = new Boolean("false");// valido para false
        Boolean b6 = new Boolean("verdadeiro");// aqui e false, qualquer coisa diferente de true, e false
        Boolean b7 = new Boolean("true ");// false cuidade com o espaço



        // wrappers => primitivos
        Long l = new Long("123");
        //xxxValue - > esse comando serve para wrappers para primitivos

        long l1 = l.longValue(); // conversão de wrappers para primitivo
        int i = l.intValue();
        double d = l.doubleValue();
        byte b = l.byteValue();// pode ser feita para qualquer tipo


        // boolean e char são convertidos apenas para o tipo deles
        boolean c1 = new Boolean("T").booleanValue();// conversão de wrappers booleano para boolean normal
        boolean c2 = b7.booleanValue();
        char c3 = new Character('a').charValue();


        //String => primitivos

        //parsexxx esse comando serve para String para tipos primitivos

        String teste = "1.2";
        double d20 = Double.parseDouble(teste); // o tipo String precisa ser compativel numerico
        int i2 = Integer.parseInt("10",5); // base

        //String => wrapper
        //costrutor // esses serve para transformar um String e um wrapper
        //valueOf   // esses serve para transformar um String e um wrapper

        String teste2 = "78";
        Double d30 = new Double(teste2);
        Double d31 = Double.valueOf(teste2);

        //primitivos => String
        //toStrings

        String d40 = Double.toString(d31);

        //Wrapper => String
        //toString

        String d41 = Double.toString(d30);




        System.out.println(d30);





    }
    
}
