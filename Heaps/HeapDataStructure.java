package Heaps;

import java.util.ArrayList;

/**
 * HeapDataStructure
 */
public class HeapDataStructure {

  static class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    // insert in Heap
    // TC: O(log n)
    public void add(int data) {
      arr.add(data);

      int x = arr.size() - 2;
      int parIdx = x / 2;

      while (arr.get(x) < arr.get(parIdx)) {
        int temp = arr.get(x);
        arr.set(x, arr.get(parIdx));
        arr.set(parIdx, temp);
      }
    }

    // Peek from Heap
    // TC: O(1)
    public int peek() {
      return arr.get(0);
    }

  }
  
  public static void main(String[] args) {
    
  }
}
