
import java.util.LinkedHashSet;

public class LinkedHashset {
    
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Pune");
 
        System.out.println(lhs); // order is maintained

    }
}
