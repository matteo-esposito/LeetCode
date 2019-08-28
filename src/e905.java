public class e905 {

    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int counter = 0;

        for (int n : A){
            if (n % 2 == 0){
                ans[counter++] = n;
            }
        }

        for (int n : A){
            if (n % 2 == 1){
                ans[counter++] = n;
            }
        }

        return ans;
    }

}
