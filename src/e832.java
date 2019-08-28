import java.util.Arrays;

public class e832 {

    public static int[][] flipAndInvertImage(int[][] A) {

        // Flip all entries
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2; j++) {
               int temp = A[i][A[i].length - 1 - j];
               A[i][A[i].length - 1 - j] = A[i][j];
               A[i][j] = temp;
            }
        }

        // Invert all values
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
            }
        }

        return A;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 1 }, { 1, 1, 0 } };
        flipAndInvertImage(arr);
    }
}
