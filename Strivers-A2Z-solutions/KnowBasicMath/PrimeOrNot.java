package KnowBasicMath;

// Check for Prime Number

// You are given an integer n. You need to check if the number is prime or not. Return true if it is a prime number, otherwise return false.

// A prime number is a number which has no divisors except 1 and itself.

// Complexity
// TC: O(sqrt(n))
// SC: O(1)

public class PrimeOrNot {

  
  static class Solution {
    public static boolean isPrime(int n) {
          if(n < 2) return false;
          if(n == 2) return true;
          if (n % 2 == 0) return false;

          for(int i = 3; i * i <= n; i+=2) {
            if(n % i == 0) return false;
          }

          return true;
    }
}

  public static void main(String[] args) {
    System.out.println(Solution.isPrime(8));
  }
}
