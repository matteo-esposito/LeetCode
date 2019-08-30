import java.util.Arrays;

public class e852 {
    
    public static int peakIndexInMountainArray(int[] A) {
        // binary search
        int left = 0;
        int right = A.length-1;

        while (left + 1 < right){
            int mid = left + (right - left) / 2;
            if (A[mid] < A[mid + 1]){
                left = mid;
            } else {
                right = mid;
            }
        }

        return A[right] > A[left] ? right : left;
    }
    
    public static void main(String[] args){
        System.out.println(peakIndexInMountainArray(new int[] {0,2,1,0})); // 1
        System.out.println(peakIndexInMountainArray(new int[] {0,2,3,11,1,0})); // 3
    }
}