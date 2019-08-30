public class m223 {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

        // total area
        int area1 = (C-A) * (D-B);
        int area2 = (G-E) * (H-F);
        int overlap = 0;

        if(!(E > C || G < A || F > D || H < B)){
            overlap = (Math.min(C,G)-Math.max(A,E))*(Math.min(D, H) - Math.max(B, F));
        }

        // get total area
        return area1 + area2 - overlap;
    }

    public static void main(String[] args) {
        System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }
}
