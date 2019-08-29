import java.util.*;

public class e001 {

    public static int[] twoSum(int[] nums, int target){
        int[] ans = {0, 1};
        Map<Integer, Integer> dict = new HashMap<>(nums.length);
        int goal = 0;

        for (int i = 0; i < nums.length; i++){
            goal = target - nums[i];
            if (dict.containsKey(goal) && dict.get(goal) != i){
                ans[0] = dict.get(goal);
                ans[1] = i;
            }
            dict.put(nums[i], i); // insert the int, index pair into dictionnary.
        }

        return ans;
    }

    public static void main(String[] args){
        int[] sol = twoSum(new int[] {2, 7, 11, 15}, 17);
        for (int s: sol){
            System.out.println(s);
        }
    }
}