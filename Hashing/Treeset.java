
import java.util.TreeSet;

public class Treeset {
    
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Pune");

        System.out.println(ts);  // null value not allowed and all values are store in sorted manner

    }
}
