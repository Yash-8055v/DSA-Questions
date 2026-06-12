package KnowBasicMath;

// LCM (Least Common Multiple)

// LCM: O(log(min(a,b))) (because LCM depends on GCD)
// Space: O(1)

public class LCM {
  

  static class Solution {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

  public static void main(String[] args) {
    System.out.println(Solution.lcm(12, 6));
  }
}
