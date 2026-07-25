
import java.util.HashMap;


// Q6: largest subarray with sum as 0
// TC: O(n)


public class Question6 {


    // Brute force approach 
    // TC: O(n ^ 2)
    // public static void main(String[] args) { 
    //     int arr[] = {15, -2, 2, -8, 1, 7, 10, 23}; 
    //     int maxSize = 0; 

    //     // Loop through all possible starting points
    //     for(int i = 0; i < arr.length; i++) { 
    //         int sum = 0; 
    //         // Loop through all possible ending points
    //         for(int j = i; j < arr.length; j++) { 
    //             sum += arr[j]; 
    //             // If sum becomes 0, calculate current subarray size
    //             if(sum == 0) { 
    //                 maxSize = Math.max(maxSize, j - i + 1); 
    //             } 
    //         } 
    //     } 
    //     System.out.println("Largest subarray size with 0 sum = " + maxSize); 
    // }

    // hashmap approach
    // TC: O(n)
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23}; 
        HashMap<Integer, Integer>  map = new HashMap<>();
        // (sum, idx)

        int sum = 0, len = 0;

        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if(map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            }else {
                map.put(sum, j);
            }
        }

        System.out.println("largest subarray with sum as 0 => " + len);

    }
}
