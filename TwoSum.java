 public class TwoSum {

    /* Problem 1
       Given an array of integers, return indices of the two numbers such that they add up to a specific target.
       You may assume that each input would have exactly one solution, and you may not use the same element twice.*/

    /* https://leetcode.com/problems/two-sum/description/ */

        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++){
                for (int j = i+1;j <nums.length; j++){
                    if (nums[i] + nums[j] == target){
                        return new int[] {i, j};
                    }
                }
            }
            throw new IllegalArgumentException("No two sum solution.");
        }

}
