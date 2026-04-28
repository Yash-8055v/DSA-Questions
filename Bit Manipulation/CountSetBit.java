public class CountSetBit {

  public static int countSetBit(int num) {
    
    int count = 0;

    // while (num > 0) {
    //   count += num & 1;
    //   num = num>>1;
    // }
    // return count;

    while (num > 0) {
      if ((num & 1) != 0) {
        count++;
      }
      num = num >> 1;
    }
  }
  public static void main(String[] args) {
    System.out.println(countSetBit(15));
  }
}
