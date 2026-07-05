package Heaps; 
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueCF {
  

  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); for changing priority order large no = high priority

    pq.add(3); // O(log n)  where n is no. of elements already present in queue
    pq.add(4);
    pq.add(1);
    pq.add(8);

    while (!pq.isEmpty()) {
      System.out.println(pq.peek()); // O(1)
      pq.remove(); // O(log n)
    }
  }
}
