import java.util.*;

public class e771 {

    public static int numJewelsInStones(String J, String S){
        Map<String, Integer> dict = new HashMap<>(J.length());
        for (String s: J.split("")){
            dict.put(s, 0);
        }
        
        Integer count = 0;
        for (String stone : S.split("")){
            if (dict.getOrDefault(stone, -1) != -1){
                count = dict.get(stone) + 1;
                dict.put(stone, count);
            }
        }

        int sum = 0;
        for (Integer i : dict.values()){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}