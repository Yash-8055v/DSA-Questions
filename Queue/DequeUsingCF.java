package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeUsingCF {
  
  public static void main(String[] args) {
    Deque<Integer> deque = new LinkedList<>();

    deque.addFirst(1);
    deque.addFirst(2);
    deque.addLast(3);
    deque.getFirst();
    deque.getLast();
    deque.removeFirst();
    deque.removeLast();
  }
}
