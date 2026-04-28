

public class InsertionSort {


    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i]; 
            int prev = i - 1;
            // Finding out the correct position
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //Insetion
            arr[prev+1] = curr;
        }
    }

    public static void printarray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        insertionSort(arr);
        printarray(arr);
    }
    
}
