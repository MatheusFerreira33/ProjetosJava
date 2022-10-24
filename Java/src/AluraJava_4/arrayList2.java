package AluraJava_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class arrayList2 {

    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<String>();
        //Collection esta no topo da hierarquia, e o arrayList esta abaixo dele
        

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String atual = iterator.next();
            System.out.println(atual);

        ArrayList<Integer> i = new ArrayList<Integer>();

        i.add(5);
        i.add(78);

        //int i2 [] = i.toArray(new int[0]);

        }
    }
}
