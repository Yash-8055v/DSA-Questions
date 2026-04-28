import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;

    x = sc.nextInt();
    String y = sc.nextLine();
    sc.nextLine();

    System.out.println(x);
    System.out.println(y);
    

    sc.close();
  }
}
