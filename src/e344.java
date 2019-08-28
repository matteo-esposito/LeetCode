import java.util.Arrays;

public class e344 {

    public static void main(String[] args){
        char[] arr = {'m', 'a', 't', 't'};
        reverseString(arr);
    }

    public static void reverseString(char[] s) {

        char[] rev_arr = new char[s.length];

        for (int i = 0; i < s.length; i++){
            rev_arr[i] = s[s.length - 1 - i];
        }

        System.out.println(Arrays.toString(rev_arr));

    }
}
