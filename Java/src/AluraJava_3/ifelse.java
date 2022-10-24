package AluraJava_3;
import java.util.Scanner;

public class ifelse {

    
        public static void main(String[] args) {
            int i;
            for (i = 0; i < 5; i++) {
                if (++i % 3 == 0) {
                    break;
                }
            }
            System.out.println(i);
        }
    }



