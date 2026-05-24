package LinkedList;
import java.util.LinkedList;

public class LLCollection {
  public static void main(String[] args) {
    // create 
    LinkedList<Integer> ll = new LinkedList<>();

    // add
    ll.addLast(1);
    ll.addFirst(2);
    ll.addFirst(3);

    // remove
    ll.removeFirst();
    ll.removeLast();
  }
}
