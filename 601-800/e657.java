public class e657 {

    public static boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;
        for (char c: moves.toCharArray()){
            if (c == 'R'){
                x++;
            } else if (c == 'L'){
                x--;
            } else if (c == 'U'){
                y++;
            } else if (c == 'D'){
                y--;
            }
        }

        return (x == 0 && y == 0);
    }

    public static void main(String[] args) {
        System.out.println((judgeCircle("LR"))); // true
    }
}
