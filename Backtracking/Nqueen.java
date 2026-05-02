package Backtracking;

// Find & Print all Permutations of a given string

// TC: O(n * n!)
// SC: O(n)

public class Nqueen {

  public static boolean isSafe(char board[][], int row, int col) {
    // vertical up
    for(int i = row - 1; i >= 0; i--){
      if (board[i][col] == 'Q') {
        return false;
      }
    }

    // diag left up
    for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }

    // diag right up
    for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }

    return true;

  }

  public static void nQueen(char board[][], int row) {
    // base case
    if (row == board.length) {
      printBoard(board);
      return;
    }

    for(int col = 0; col < board.length; col++) {
      if (isSafe(board, row, col)) {
        board[row][col] = 'Q';
        nQueen(board, row + 1);
        board[row][col] = 'x';
      }
    }
  }

  public static void printBoard(char board[][]) {
    for(int row=0; row<board.length; row++) {
      for(int col=0; col<board.length; col++) {
        System.out.print( "\t"+board[row][col] + " ");
      }
      System.out.println();
    }
    System.out.println("\t------------------------------------");
  }
  public static void main(String[] args) {
    int n = 4;
    char board[][] = new char[n][n];

    // initialize board with  .
    for(int row=0; row<n; row++) {
      for(int col=0; col<n; col++) {
        board[row][col] = 'x';
      }
    }

    nQueen(board, 0);
  }

  
}
