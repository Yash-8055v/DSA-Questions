
import java.util.HashSet;



/**
 * Hashset
 */
public class Hashset {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(7);
        set.add(1);
        set.add(9);
        set.add(0);

        System.out.println(set);

        System.out.println(set.remove(2));

        System.out.println(set.contains(4));

        System.out.println(set.size());

        System.out.println(set.isEmpty());

        set.clear();
        
    }
}