package KnowBasicMath;

// Check if the Number is Armstrong

// You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.



// An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

// EG: 153 is armstrong 

// Complexity

// count(n) runs once over all digits → O(d)

// Second loop runs once over all digits → O(d)

// Total:

// TC = O(d) + O(d) = O(d) = O(log n)

// SC = O(1)

public class Armstrong {

  static class Solution {

    public static int count(int n) {
        int count = 0;
        if(n == 0) return 1;
        while(n != 0){
            n = n / 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int n) {
        int orgNum = n;
        int power = count(n);
        int sum = 0;
        while(n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, power);
            n = n / 10;
        }
        return orgNum == sum;

    }
}
  
  public static void main(String[] args) {
    System.out.println(Solution.isArmstrong(12));
  }
}
