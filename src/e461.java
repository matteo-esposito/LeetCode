public class e461 {

    public static int hammingDistance(int x, int y){
        int val = x ^ y; // here we make use of the convenient bitwise operations that java has.
        return Integer.bitCount(val);
    }

    public static void main(String[] args){
        System.out.println(hammingDistance(1, 4));
    }
}
