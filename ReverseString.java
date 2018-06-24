public class ReverseString {

    /* Problem 344
       Write a function that takes a string as input and returns the string reversed. */

    /* https://leetcode.com/problems/reverse-string/description/ */

    public String reverseString(String s)  {

        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i<j){
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }

        return String.valueOf(arr);
    }

}
