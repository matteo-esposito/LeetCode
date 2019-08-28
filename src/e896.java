public class e896 {
    public boolean isMonotonic(int[] A) {
        int inc_counter = 0;
        int dec_counter = 0;

        for (int i = 0; i < A.length - 1; i++){
            if (A[i] < A[i+1]){
                inc_counter++;
            } else if (A[i] == A[i+1]) {
                inc_counter++;
                dec_counter++;
            } else {
                dec_counter++;
            }
        }

        return (inc_counter == A.length-1 || dec_counter == A.length-1);
    }
}
