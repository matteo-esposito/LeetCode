import java.util.Arrays;

class p1108 {

    public static String defangIPaddr(String address) {

        String[] word = address.split("");
        Boolean[] dot_chars = new Boolean[word.length];

        int d_pointer = 0;
        for (String s : word){
            if (s.equals(".")){
                dot_chars[d_pointer] = true;
            } else {
                dot_chars[d_pointer] = false;
            }
            d_pointer++;
        }

        int w_pointer = 0;
        for (Boolean b : dot_chars){
            if (b){
                word[w_pointer] = "[.]";
            }
            w_pointer++;
        }

        String str = "";
        for (String w : word){
            str += w;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println((defangIPaddr("1.1.1.1")));
    }

}