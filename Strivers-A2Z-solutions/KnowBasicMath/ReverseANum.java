package KnowBasicMath;

// Reverse a number
// You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

// Complexity
// TC = O(number of digits) = O(log n)
// SC = O(1)

public class ReverseANum {
  
  static class Solution {
    public static int reverseNumber(int n) {
        
        int rev = 0;
        while(n != 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return rev;
    }
}

  public static void main(String[] args) {
    System.out.println(Solution.reverseNumber(1234));
  }
}
