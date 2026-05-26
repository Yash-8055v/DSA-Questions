package Stack;

import java.util.Stack;

// Stack Q1: Push at the Bottom of the Stack
// TC : O(n)

public class Question1 {

  public static void pushAtBottom(int item, Stack<Integer> s) {
    // base case
    if (s.isEmpty()) {
      s.push(item);
      return;
    }

    int top = s.pop();
    pushAtBottom(item, s);
    s.push(top);
  }

  public static void printStack(Stack<Integer> s) {
    while (!s.isEmpty()) {
      System.out.println(s.pop());
      
    }
    System.out.println();
  } 
  
  

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    pushAtBottom(4, s);
    pushAtBottom(5, s);
    printStack(s);
    
  }
}
