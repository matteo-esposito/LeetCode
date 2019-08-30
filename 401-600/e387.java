public class e387{

    public static int firstUniqChar(String s) {
        
        for (int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        System.out.println(firstUniqChar("leetcode")); // 0
        System.out.println(firstUniqChar("loveleetcode")); // 2
    }    
}