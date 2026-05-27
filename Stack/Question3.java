package Stack;
import java.util.Stack;
// Stack Q3: Reverse a Stack 
//  TC:  O(n)
// SC: O(1)

public class Question3 {
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

  public static void reverseStack(Stack<Integer> s) {

    if (s.isEmpty()) {
      return;
    }

    int top = s.pop();
    reverseStack(s);
    pushAtBottom(top, s);
  }

  public static void printStack(Stack<Integer> s) {
    while (!s.isEmpty()) {
      System.out.println(s.pop());
    }
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    
    reverseStack(s);
    printStack(s);
  }
}
