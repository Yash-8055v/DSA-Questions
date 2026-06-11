package KnowBasicMath;

// Count all Digits of a Number

// You are given an integer n. You need to return the number of digits in the number.


// The number will have no leading zeroes, except when the number is 0 itself.

// Time & Space Complexity
// Time: O(log n)
// Space: O(1)

public class CountAllDigits {

  class Solution {
    public static int countDigit(int n) {
        int count = 0;
        if(n == 0) return 1;
        while(n != 0){
            n = n / 10;
            count++;
        }
        return count;
    }
}
  
  public static void main(String[] args) {
    System.out.println(Solution.countDigit(14));
  }
}
