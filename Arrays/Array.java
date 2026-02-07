public class Array {

  public static void main(String[] args) {
    // int[] arr = new int[]{1, 5, 8, 2, 0, 9, 5, 3, 55};
    int[] arr = new int[]{1, 5, 5, 0, 5};
    // System.out.println(maxElement(arr));
    // reverseArray(arr);

    // leftRotateByOne(arr);
    
    // rotate(arr, 3);
    // moveZeros(arr);
    
    System.out.println(majorityElement(arr));
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    // System.out.println(isSorted(arr));
   
 // System.out.println(removeDuplicates(arr));
System.out.println(missingElement(arr));

    
  }

  // Q1. Find Maximum Element
  public static int maxElement(int[] arr) {
    int maxValue = arr[0];
    for(int i = 1; i < arr.length; i++) {
      if (arr[i] > maxValue) {
        maxValue = arr[i];
      }
    }
    return maxValue;
  }

  // Q2. Reverse an Array
  public static void reverseArray(int[] arr) {
    int l = 0, r = arr.length - 1;

    while (l < r) {
      int temp = arr[l];
      arr[l] = arr[r];
      arr[r] = temp;
      l++; r--;
    }

    
  }

  // Q3. Check if array sorted
  public static boolean isSorted(int[] arr) {
    for(int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        return false;
      }
    }
    return true;
  }

  // Q4. Remove duplicate from sorted array
  public static int removeDuplicates(int[] arr) {
    if (arr.length == 0) return 0;

    int i = 0;

    for (int j = 1; j < arr.length; j++) {
        if (arr[j] != arr[i]) {
            i++;
            arr[i] = arr[j];
        }
    }
    return i + 1;
}

  // Q5: Left Rotate Array by 1
  public static void leftRotateByOne(int[] arr) {

    int temp = arr[0];
    for(int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = temp;
  }

  // Q6:  Rotate Array right by k
  public static void rotate(int[] nums, int k) {
        for(int j = 1; j <= k; j++) {
            int temp = nums[nums.length - 1];
            for(int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
        }
    }
  
    
    // Q7: Move Zeroes
    public static void moveZeros(int[] nums) {
    int j = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != 0) {
        nums[j] = nums[i];
        j++;
      }
    }

    while (j < nums.length) {
      nums[j] = 0;
      j++;
    }
  }

    // Q8: Find majority element
   public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

  // Q9: find missing number 
  public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int x : nums) {
            actualSum += x;
        }

        return expectedSum - actualSum;
    }
  }


  // Q10: Find single number
    public static int singleNumber(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            ans = ans ^ num;
        }

        return ans;
    }

