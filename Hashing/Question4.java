
import java.util.HashSet;



// Q4: Union and intersection of 2 arrays
// TC: O(n+m)
public class Question4 {
    
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();
        // union: O(n+m)
        for(int num : arr1) {
            set.add(num);
        }

        for(int num : arr2) {
            set.add(num);
        }

        System.out.println("union = " + set.size());

        // intersection : O(n+m)
        set.clear();

        for(int num : arr1) {
            set.add(num);
        }
        
        int count = 0;
         for(int num : arr2) {
            if(set.contains(num)) {
                count++;
                set.remove(num);
            }
        }

        System.out.println("intersection = " + count);

    }
}
