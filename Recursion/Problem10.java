//*  Friends pairing problem

public class Problem10 {

  public static void main(String[] args) {
    System.out.println(pairingProblem(4));
  }

  public static int pairingProblem(int n) {

    //*  Base case
    if (n == 1 || n == 2) {
      return n;
    }

    //* Work */
    return pairingProblem(n - 1) + (n - 1) * pairingProblem(n - 2);

  }
}