//* Print all binary strings of size N without consecutive ones */

public class Problem11 {
  public static void main(String[] args) {
    printBinString(3, 0, "");

    
  }

  public static void printBinString(int n, int lastPlace, String str) {
    //* base case */
    if (n == 0) {
      System.out.println(str);
      return;
    }

    //* Work */
    printBinString(n - 1, 0, str+"0");
    if (lastPlace == 0) {
      printBinString(n - 1, 1, str+"1");
    }
  }
}
