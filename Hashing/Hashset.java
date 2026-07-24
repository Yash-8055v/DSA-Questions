
import java.util.HashSet;
import java.util.Iterator;



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

        // Iteration on HashSet

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Pune");

        // a) using Iterators
        // TC: O(n)
        Iterator it = cities.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

      
        
    }
}