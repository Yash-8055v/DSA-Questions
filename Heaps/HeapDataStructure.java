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

    // Delete from Heap
    // TC: O(log n)

    private void heapify(int idx) {
      int left = 2*idx+1;
      int right = 2*idx+2;
      int minIdx = idx;  

      // check if left child is min
      if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
        minIdx = left;
      }

      // check if right child is min
      if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
        minIdx = right;
      }

      if (minIdx != idx) {  // if root is not min then only swap otherwise if root is min no need of swap

        int temp = arr.get(idx);
        arr.set(idx, arr.get(minIdx));
        arr.set(minIdx, temp);

        heapify(minIdx); // now again call for next level
        
      }
    }
    public int remove() {
      int data = arr.get(0); // get root(element to delete) element

      // Delete &  Heap fix logic
      
      // 1. swap first and last 
      int temp = arr.get(0);
      arr.set(0, arr.size() - 1);
      arr.set(arr.size() - 1, temp);

      // 2. delete last
      arr.remove(arr.size() - 1);

      // 3. heapify
      heapify(0);
      return data; // return deleted element
    }

  }
  
  public static void main(String[] args) {
    
  }
}
