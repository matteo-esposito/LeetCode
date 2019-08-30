import java.util.*;

public class e217 {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> vals = new HashSet<Integer>();
        for (int n : nums){
            vals.add(n);
        }
        return (nums.length != vals.size());
    }
    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[] {1,2,3,4})); //false
        System.out.println(containsDuplicate(new int[] {1,2,3,4,3})); //true
    }
}
