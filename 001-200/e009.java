public class e009 {

    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        char[] n = num.toCharArray();
        char[] rev_n = new char[n.length];

        // flip array
        for (int j = 0; j < n.length; j++){
            rev_n[j] = n[n.length-1-j];
        }

        // check
        for (int i = 0; i < n.length; i++){
            if (n[i] != rev_n[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}