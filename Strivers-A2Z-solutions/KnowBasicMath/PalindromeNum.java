package KnowBasicMath;

// Palindrome Number

// You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.

// A palindrome number is a number which reads the same both left to right and right to left.

// Complexity
// TC = O(number of digits) = O(log n)
// SC = O(1)


public class PalindromeNum {

  static class Solution {
    public static boolean isPalindrome(int n) {
        int orgNum = n;
        int rev = 0;
        while(n != 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return orgNum == rev;
    }
  }
  
  public static void main(String[] args) {
    System.out.println(Solution.isPalindrome(1121));
  }
}
