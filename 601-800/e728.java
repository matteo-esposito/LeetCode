import java.util.ArrayList;
import java.util.List;

public class e728 {

    public static boolean isSelfDiv(int n){
        int temp = n;
        while (temp != 0){
            if (temp % 10 == 0){
                return false;
            } else {
                if (n % (temp % 10) != 0) {
                    return false;
                } else {
                    temp /= 10;
                }
            }

        }
        return true;
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++){
            if (isSelfDiv(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> a = selfDividingNumbers(1, 22);
        for (int num : a){
            System.out.print(num + " ");
        }
    }
}
