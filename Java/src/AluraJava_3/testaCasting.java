package AluraJava_3;
public class testaCasting {
    public static void main(String[] args) {

        double d = 15.03;
        int i; // aqui ele vai da erro, porque não se pode colocar o maior no menor
        int in = (int) d; // essa expressão se chama casting ( assumindo o risco de perda de dado )

        /*int i1 = 3 / 2; // 1,5
        double i2 = 3 / 2; // 1.5
        double i3 = 3 / 2.0; // 1.50

        long x = 0;
        //double d = 0;
        double zero = x + d; // 0 */
        //System.out.println(i1 + i2 + i3 + x + d + zero);
        System.out.println(in);

    }
}
