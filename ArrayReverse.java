public class ArrayReverse {

    public static void reverseArray(int arr[]){
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
 public static void main(String[] args) {
    int numbers[] = {1,4,10,16};
    reverseArray(numbers);
 }   
}
