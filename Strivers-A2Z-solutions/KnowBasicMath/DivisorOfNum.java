package KnowBasicMath;
import java.util.*;

// Print all Divisors of a given Number

// Problem Statement: Given an integer N, return all divisors of N.
// A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

// Brute Force Approach

// Complexity Analysis
// Time Complexity: O(N), we check for every number from 1 to N.
// Space Complexity: O(N), extra space used for storing divisors.

// public class DivisorOfNum {
  

// static class Solution {
//     // Function to find all divisors
//     public List<Integer> getDivisors(int N) {
//         // Create list to store divisors
//         List<Integer> res = new ArrayList<>();

//         // Loop from 1 to N
//         for (int i = 1; i <= N; i++) {
//             // Check if i is a divisor of N
//             if (N % i == 0) {
//                 // Add i to the result
//                 res.add(i);
//             }
//         }
//         // Return the list of divisors
//         return res;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create object of Solution class
//         Solution sol = new Solution();

//         // Input number
//         int N = 36;

//         // Call the function to get divisors
//         List<Integer> result = sol.getDivisors(N);

//         // Print the result
//         System.out.print("Divisors of " + N + ": ");
//         for (int val : result) {
//             System.out.print(val + " ");
//         }
//         System.out.println();
//     }
// }



// }

// Optimal Approach

// Iterate from 1 to sqrt(N) and for every divisor found, if N/divisor is distinct


// Complexity Analysis
// Time Complexity: O(N), we check for every number from 1 to N.
// Space Complexity: O(N), extra space used for storing divisors.

public class DivisorOfNum {

  

static class Solution {
    // Function to get all divisors
    public List<Integer> getDivisors(int N) {
        // Create a list to store divisors
        List<Integer> res = new ArrayList<>();

        // Loop from 1 to square root of N
        for (int i = 1; i * i <= N; i++) {
            // Check if i divides N
            if (N % i == 0) {
                // Add i to result
                res.add(i);

                // If N / i is different from i, add N / i too
                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }

        // Return the list of divisors
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Input number
        int N = 36;

        // Get divisors
        List<Integer> result = sol.getDivisors(N);

        // Print the result
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

}