public class e067 {
    public static String addBinary(String a, String b) {
        String[] A = a.split("");
        String[] B = b.split("");
        int ind1 = A.length - 1;
        int ind2 = B.length - 1;
        int carry = 0;
        StringBuilder sol = new StringBuilder();

        // binary addition logic.
        while (ind1 >= 0 && ind2 >= 0){
            if (A[ind1].equals("0") && B[ind2].equals("0")){
                if (carry == 0){
                    sol.append("0");
                    carry = 0;
                } else {
                    sol.append("1");
                    carry = 0;
                }
            } else if (A[ind1].equals("1") && B[ind2].equals("1")){
                if (carry == 0){
                    sol.append("0");
                    carry = 1;
                } else {
                    sol.append("1");
                    carry = 1;
                }
            } else {
                if (carry == 0){
                    sol.append("1");
                    carry = 0;
                } else {
                    sol.append("0");
                    carry = 1;
                }
            }
            ind1--;
            ind2--;
        }

        // deal with the remaining characters in the longer of the two strings.
        while (ind1 >= 0){
            if (A[ind1].equals("0")){
                if (carry == 0){
                    sol.append("0");
                    carry = 0;
                } else {
                    sol.append("1");
                    carry = 0;
                }
            } else {
                if (carry == 0){
                    sol.append("1");
                    carry = 0;
                } else {
                    sol.append("0");
                    carry = 1;
                }
            }
            ind1--;
        }
        
        while (ind2 >= 0){
            if (B[ind2].equals("0")){
                if (carry == 0){
                    sol.append("0");
                    carry = 0;
                } else {
                    sol.append("1");
                    carry = 0;
                }
            } else {
                if (carry == 0){
                    sol.append("1");
                    carry = 0;
                } else {
                    sol.append("0");
                    carry = 1;
                }
            }
            ind2--;
        }


        if (carry == 1){
            sol.append("1");
        }
        String res = sol.reverse().toString();
        return res;
    }

    public static void main(String[] args){
        System.out.println(addBinary("0", "10")); // 100
        System.out.println(addBinary("1010", "1011")); // 10101
    }
}