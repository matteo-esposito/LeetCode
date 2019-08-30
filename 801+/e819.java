import java.util.Arrays;

public class e819 {

    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] para  = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
        String mostCommon = "";
        
        int maxFreq = 0;
        int freq = 0;

        for (int i = 0; i < para.length; i++){
            String tempval = para[i];
            freq = 0;
            for (String s : para){
                if (!Arrays.asList(banned).contains(tempval) && s.equals(tempval)){
                    freq++;
                }
            }
            if (freq > maxFreq){
                mostCommon = para[i];
                maxFreq = freq;
            }
        }

        return mostCommon;
    }

    public static void main(String[] args){
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"})); // ball
        System.out.println(mostCommonWord("a, a, a, a, b,b,b,c, c", new String[] {"a"})); // b
    }
}
