import java.util.Arrays;

public class e709 {

    public static void main(String[] args) {
        System.out.println(toLowerCase("QWERhello"));
    }

    public static String toLowerCase(String str){

        String[] word = str.split("");

        for (int i = 0; i<word.length; i++){
            word[i] = word[i].toLowerCase();
        }

        return String.join("", word);
    }

}
