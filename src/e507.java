import java.util.ArrayList;

public class e507 {

    public static boolean checkPerfectNumber(int num) {
        ArrayList<Integer> divs = getDivisors(num);
        int sum = 0; // to avoid 0 case
        if (num == 0){
            return false;
        }

        for (int d : divs){
            sum += d;
        }
        return sum == num;
    }

    public static ArrayList<Integer> getDivisors(int n){
        ArrayList<Integer> divs = new ArrayList<>();
        int d = 1;

        while (d < n / 2 + 1){
            if (n % d == 0){
                divs.add(d);
            }
            d++;
        }

        return divs;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
}
