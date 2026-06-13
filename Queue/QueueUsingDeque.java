package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
  
  static class  Queue {
  
    Deque<Integer> deque = new LinkedList<>();

    public void Add(int data){
      deque.addLast(data);
    }

    public int remove() {
      return deque.removeFirst();
    }

    public int peek() {
      return deque.getFirst();
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();

    q.Add(1);
    q.Add(2);
    q.Add(3);

    System.out.println(q.remove());
    System.out.println(q.peek());
  }
}
