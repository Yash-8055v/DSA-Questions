// Find no of ways to reach from 0,0 to n-1, M-1 in a n * m grid
// allowed moves - right and down
// TC = O (N + M)


package Backtracking;

public class Gridways {

  public static int gridWays(int i, int j, int n, int m) {
    // base case
    if (i == n-1 && j == m-1) {
      // condition for last call - return 1 way
      return 1;
    }else if (i == n || j == n) {
      // boundary cross condition - return 0 way
      return 0;
    }

    return gridWays( i+1, j, n, m) + gridWays(i, j+1, n, m);

  }

  public static void main(String[] args) {
    int n = 3, m = 3;
    System.out.println(gridWays(0, 0, n, m));
  }
}