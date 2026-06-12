package KnowBasicMath;

// GCD (Greatest Common Divisor) or HCF (Highest Common Factor)


// Time Complexity: O(log(min(a, b)))
// Space Complexity: O(1) for iterative version

public class GCD {

  static class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}

// OR

// static class Solution {
//     public static int gcd(int a, int b) {
//         if (b == 0) return a;
//         return gcd(b, a % b);
//     }
// }
  

// OR Time Complexity: O(max(n1, n2)) in the worst case
// class Solution {
//     public int GCD(int n1, int n2) {
//         while (n1 != n2) {
//             if (n1 > n2) {
//                 n1 -= n2;
//             } else {
//                 n2 -= n1;
//             }
//         }

//         return n1;
//     }
// }

  public static void main(String[] args) {
    System.out.println(Solution.gcd(6, 12));
  }
}
