package Stack;

import java.util.Stack;

// Stack Q5: Next Greater Element
//  TC:  O(n)
// SC: 

public class Question5 {
  
  public static void main(String[] args) {
    int arr[] = {6, 8, 0, 1, 3};
    Stack<Integer> s = new Stack<>();
    int nextGreater[] =  new int[arr.length];

    for(int i = arr.length - 1; i >= 0; i--) {
      // while loop
      while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop();
      }

      // if-else
      if (s.isEmpty()) {
        nextGreater[i] = -1;
      }else{
        nextGreater[i] = arr[s.peek()];
      }

      // push in s
      s.push(i);
    }

    for(int i = 0; i < nextGreater.length; i++){
      System.out.println(nextGreater[i] + " ");
    }
  }


}
