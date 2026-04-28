public class LinearSearch {

    public static int linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {3,5,2,10,7,4};
        int key = 10;
        int idx = linearSearch(numbers, key);

        if(idx == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Element Found at index: " + idx);
        }
    }
}