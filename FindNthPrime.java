import java.util.Scanner;

public class FindNthPrime {

  public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static int findNthPrime(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            num++;

            if (isPrime(num)) {
                count++;
            }
        }

        return num;
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(findNthPrime(n));

        sc.close();
  }
}

