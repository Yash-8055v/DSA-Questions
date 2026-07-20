

import java.util.HashMap;

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

    }
}