package AluraJava_2;

public class TestaStringBuilder {

    public static void main(String[] args) {

    StringBuffer sb = new StringBuffer();
    sb.append("Matheus");
    sb.append("Tem a idade");
    sb.append(20);

    //System.out.println(sb);

    StringBuffer sb2 = new StringBuffer(sb);

    sb2.append("ele adcinou os outros");

    sb2.insert(20, " eu sou doidao ");
    sb2.delete(5, 20);


    System.out.println(sb2.toString());
    System.out.println(new StringBuffer("MATHEUS").reverse());
    
}
}