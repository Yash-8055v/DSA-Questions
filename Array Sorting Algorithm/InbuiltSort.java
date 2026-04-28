import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void printarray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void printarray(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        Integer revArr[] = {5,4,6,1,2};
        Arrays.sort(arr);
        
        printarray(arr);
        System.out.println();
        Arrays.sort(revArr, Collections.reverseOrder());
        printarray(revArr);
    }
    
}
