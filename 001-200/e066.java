class e066 {
    public int[] plusOne(int[] digits) {
        int currentindex = digits.length - 1;
        int carry = 0;
        
        while (currentindex >= 0){
            digits[currentindex]++;
            if (digits[currentindex] == 10){
                digits[currentindex] = 0;
                carry = 1;
                currentindex--;
            } else {
                carry = 0;
                break;
            }
        }

        if (carry == 1){
            int[] newarr = new int[digits.length+1];
            newarr[0] = 1;
            return newarr;
        }

        return digits;
    }
}