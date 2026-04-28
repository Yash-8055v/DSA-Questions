// Find first occurrence of an element in arr

public class Problem6 {
  public static int firstOccurance(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    }

    if (arr[i] == key) {
      return i;
    }

    return firstOccurance(arr, key, i + 1);
  }
  public static void main(String[] args) {

    int arr[] = {2, 5, 9, 1, 3, 9, 3, 8};
    int key = 3;
    System.out.println(firstOccurance(arr, key, 0));
  }
}
