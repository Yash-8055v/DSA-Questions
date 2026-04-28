// Print Factorial of a number
// TC = O(n)
// SC = O(n) because in call stack at worst case we store n variables

public class Problem2 {

  public static int fact(int n) {
    if (n == 1 || n == 0) {
      return 1;
    }
    return n * fact(n -1);

  }
  public static void main(String[] args) {
    System.out.println(fact(5));;
  }
}
