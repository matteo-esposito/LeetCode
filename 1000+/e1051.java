import java.util.*;
class e1051 {
    public static int heightChecker(int[] heights) {
        int[] sortedHeights = new int[heights.length];
        for (int i = 0; i < heights.length; i++){
            sortedHeights[i] = heights[i];
        }
        Arrays.sort(sortedHeights);
        int count = 0;

        for (int i = 0; i < heights.length; i++){
            if (heights[i] != sortedHeights[i]){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        System.out.println(heightChecker(new int[] {1,1,4,2,1,3})); // 3
    }
}