public class BinarySearch {

    public static int binarySearch(int arr[], int key){
        int st = 0, end = arr.length -1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                st = mid + 1;
            }else{
                end = mid -1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,4,10,16,20};
        int key = 10;
        int idx = binarySearch(numbers, key);

        if(idx == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Element Found at index: " + idx);
        }
    }
}
