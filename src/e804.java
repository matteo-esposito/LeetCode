import java.util.HashSet;

public class e804 {

    public static int uniqueMorseRepresentations(String[] words) {

        String[] MORSE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
        HashSet set = new HashSet();

        for (String word : words){
            String str = "";
            char[] letters = word.toCharArray();
            for (char l : letters){
                str += MORSE[(int) l - 97];
            }
            set.add(str);
        }

        return set.size();
    }

    public static void main(String[] args) {
        String[] arr = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(arr));
    }

}
