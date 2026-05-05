package ArrayList;

import java.util.ArrayList;

public class Operations {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(2,6);

    list.get(3);

    list.remove(4);

    list.set(0, 9);

    System.out.println(list);
    System.out.println(list.contains(9));
  }

  
}
