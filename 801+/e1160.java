import java.util.*;

class e1160 {

    public static int countCharacters(String[] words, String chars) {
        Set<String> usable_chars = new HashSet<String>();
        for (String c: chars.split("")){
            usable_chars.add(c);
        }

        int result = 0;
        for (int i = 0; i < words.length; i++){
            boolean ok = true;
            for (String w: words[i].split("")){
                
                // ensure that all chars appear once in original string.
                Set<String> unique_word = new HashSet<String>();
                for (String s: words[i].split("")){
                    unique_word.add(s);
                }

                if (unique_word.size() == words[i].length()){
                    if (!usable_chars.contains(w)){
                        ok = false;
                    }
                } else {
                    ok = false;
                }
            }
            if (ok){
                System.out.println(words[i]);
                result += words[i].length();
            }
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println(countCharacters(new String[] {"cat", "bt", "hat", "tree"}, "atach")); // 6
        System.out.println(countCharacters(new String[] {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"},
        "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp")); // 0
    }
}