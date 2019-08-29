public class e977 {
    public int[] sortedSquares(int[] A) {
        // start
        int pp = 0;
        int[] ans = new int[A.length];

        while(pp < ans.length - 1 && ans[pp] < 0){
            pp++;
        }

        // more pointers
        int np = pp - 1;
        int finalp = 0;

        while (np >= 0 && pp < A.length){
            if (A[np]*A[np] < A[pp]*A[pp]){
                ans[finalp++] = A[np]*A[np];
                np--;
            } else {
                ans[finalp++] = A[pp]*A[pp];
                pp++;
            }
        }

        while (pp < A.length){
            ans[finalp++] = A[pp++]*A[pp++];
        }

        while (np >= 0){
            ans[finalp++] = A[np--]*A[np--];
        }

        return ans;
    }
}
