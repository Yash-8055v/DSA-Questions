// Sorting an ArrayList

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAL {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(3);
    list.add(6);

    System.out.println(list);

    Collections.sort(list); // asc order

    System.out.println(list);

    Collections.sort(list, Collections.reverseOrder()); // desc order

    System.out.println(list);
  }
}
