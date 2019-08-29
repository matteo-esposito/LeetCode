import java.util.HashSet;

public class e961 {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> seen = new HashSet<>();
        for (int n: A){
            if (seen.contains(n)){
                return n;
            } else {
                seen.add(n);
            }
        }
        return -1;
    }
}
