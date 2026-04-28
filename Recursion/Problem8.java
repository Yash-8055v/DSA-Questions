//print x to the power n
// TC= O(n)

//print x to the power n optimized
// TC= O(log n)


public class Problem8 {

  public static int printPower(int n, int x) {
    if (x == 1) {
      return n;
    }
    return n * printPower(n, x - 1);
  }

  public static int printPowerOptimized(int n, int x) {
    if (x == 1) {
      return n;
    }
    int halfPower = printPowerOptimized(n, x/2); // now TC is O(log n)
    if (x % 2 != 0) {
      // return n * printPowerOptimized(n, x/2) * printPowerOptimized(n, x/2); // still TC O(n)
      return n * halfPower * halfPower;
    }

    return halfPower * halfPower;
  }
  public static void main(String[] args) {
    // System.out.println(printPower(10, 2));
    System.out.println(printPowerOptimized(10, 3));
  }
}
