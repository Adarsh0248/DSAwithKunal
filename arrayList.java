import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(11);
        l1.add(13);
        l1.add(14);
        l1.add(56);
        l1.add(65);
        l1.add(76);
        for (int j = 0; j < l1.size(); j++) {
            System.out.println(l1.get(j));
        }
        System.out.println(l1);
        l1.add(2,2);
        System.out.println(l1);
        l1.set(2,22);
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);
        l1.add(13);
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(13)));
        System.out.println(l1);
//        System.out.println(l1.remove(Integer.valueOf(13)));
//        System.out.println(l1);
        System.out.println(l1.contains(Integer.valueOf(76)));
        Collections.reverse(l1);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        ArrayList l2 = new ArrayList();
        l2.add("Welcome");
        l2.add("Hello");
        l2.add("Adarsh");
        l2.add("Nothing");
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println(l2);
    }
}
