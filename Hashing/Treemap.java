
import java.util.TreeMap;

// TC: O(log n) for put(), remove(), get()
public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> hm = new TreeMap<>();

        hm.put("india", 100);
        hm.put("US", 40);
        hm.put("China", 60);
        hm.put("UK", 200);
    }
}
