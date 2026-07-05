package Heaps; 
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueCF {
  
  // PQ for Object
  static class  Student implements Comparable<Student> {
    String name;
    int rank;

    public Student(String name, int rank) {
      this.name = name;
      this.rank = rank;
    }

    @Override
    public int compareTo(Student s2) {
      return this.rank - s2.rank;
    }
    
  }

  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); for changing priority order large no = high priority

    pq.add(3); // O(log n)  where n is no. of elements already present in queue
    pq.add(4);
    pq.add(1);
    pq.add(8);

    // while (!pq.isEmpty()) {
    //   System.out.println(pq.peek()); // O(1)
    //   pq.remove(); // O(log n)
    // }

    PriorityQueue<Student> pq2 = new PriorityQueue<>();
    // PriorityQueue<Student> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); for reverse order


    pq2.add(new Student("A", 4));
    pq2.add(new Student("B", 8));
    pq2.add(new Student("B", 3));
    pq2.add(new Student("D", 1));

    while (!pq2.isEmpty()) {
      System.out.println(pq2.peek().name + " -> " + pq2.peek().rank);
      pq2.remove();
    }
  }
}
