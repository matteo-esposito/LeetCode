public class e888 {

    public static int arrSum(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }

    public static int[] fairCandySwap(int[] A, int[] B) {

        int[] ans = new int[2];
        int diff = arrSum(A) - arrSum(B);

        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < B.length; j++){
                if (A[i] - B[j] == diff / 2){
                    ans[0] = A[i];
                    ans[1] = B[j];
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        fairCandySwap(new int[] {1, 1}, new int[] {2, 2});
    }
}