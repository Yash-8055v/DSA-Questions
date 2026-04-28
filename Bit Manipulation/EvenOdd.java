

public class EvenOdd {
    public static void evenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
            
        }
    }
    public static void main(String[] args) {
        int num = 4;
        evenOrOdd(num);
    }
}
