// print no from n to 1 (Descending order)
// print no from 1 to n (Ascending order)

public class Problem1 {

  public static void printNo(int n) {
    if (n < 1) {
      return;
    }
    // System.out.println(n);   // to print in desc order
    printNo(n - 1);
    System.out.println(n); // to print in asc order
  }
  public static void main(String[] args) {
    printNo(10);
  }


}
