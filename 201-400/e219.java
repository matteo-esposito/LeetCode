import java.util.*;

public class e219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> dict = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (dict.containsKey(nums[i])){
                int index = dict.get(nums[i]);
                if (Math.abs(index - i) <= k){
                    return true;
                } else {
                    dict.put(nums[i], i);
                }
            } else {
                dict.put(nums[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args){
        System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1}, 3)); //true
        System.out.println(containsNearbyDuplicate(new int[] {1,0,1,1}, 1)); //true
        System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2)); //false
    }
}
