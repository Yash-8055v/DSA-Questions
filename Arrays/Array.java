public class Array {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 5, 8, 2, 0, 9, 5, 3, 55};
    System.out.println(maxElement(arr));
    reverseArray(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
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


  
}