

import java.util.HashMap;
import java.util.Set;

public class Hashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("UK", 20);

        System.out.println(hm);

        System.out.println(hm.get("India"));

        System.out.println(hm.containsKey("China"));

        System.out.println(hm.remove("US"));

        System.out.println(hm.size());

        System.out.println(hm.isEmpty());

        hm.clear();

        // Iterate 
        Set<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println("Key = " + k + " ,value =  " + hm.get(k));
        }

    }
}