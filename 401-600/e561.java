import java.util.Arrays;

public class e561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int minSum = 0;
        
        for (int i = 0; i <= nums.length / 2 - 1; i++){
            minSum += nums[2*i];
        }

        return minSum;
    }

    public static void main(String[] args){
        System.out.println(arrayPairSum(new int[] {1,4,3,2}));
    }
}