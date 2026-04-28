// Find last occurrence of an element in arr

public class Problem7 {
  public static int lastOccurance(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    }

    int isFound = lastOccurance(arr, key, i + 1);

    if (isFound == -1 && arr[i] == key) {
      return i;
    }

    return isFound;
    
  }
  public static void main(String[] args) {

    int arr[] = {2, 5, 9, 1, 3, 9, 3, 8};
    int key = 3;
    System.out.println(lastOccurance(arr, key, 0));
  }
}
