public class e942 {
    public static int[] diStringMatch(String S) {
        String[] directions = S.split("");
        int[] sol = new int[directions.length+1];
        int val1 = 0;
        int val2 = directions.length;
        
        for (int i = 0; i < directions.length; i++){
            if (directions[i].equals("I")){
                sol[i] = val1++;
            } else {
                sol[i] = val2--;
            }
        }

        sol[directions.length] = directions[directions.length-1].equals("I") ? val1 : val2;

        return sol;
    }
}