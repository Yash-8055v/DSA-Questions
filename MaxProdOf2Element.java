
// Maximum Product of Two Elements in an Array

public class MaxProdOf2Element {
    public static  int maxProduct(int[] nums) {
        int ma1 = Integer.MIN_VALUE, ma2 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > ma1) {
                ma2 = ma1;
                ma1 = nums[i];
            }else if(nums[i] > ma2) {
                ma2 = nums[i];
            }

           
        }
        return (ma1 - 1 ) * (ma2 - 1);
    }
    public static void main(String[] args) {
        int nums[] = {3, 5, 1, 9, 8};
        System.out.println(maxProduct(nums));
    }
}
