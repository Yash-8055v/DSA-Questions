package KnowBasicMath;

public class Temp {

  public static void recursion(int n) {
    if(n == 0) return;
    System.out.println("hello " + n);
    recursion(n--);
  }
  

  public static void main(String[] args) {
    recursion(10);
  }
}
