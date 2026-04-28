



public class LargestNum {

    public static int largest(int arr[]){
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
       int numbers[] = {1,5,2,10,7,4};
       System.out.println("Largest element is: " + largest(numbers));
    }
}