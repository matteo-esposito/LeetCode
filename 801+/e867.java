class e897 {
    public int[][] transpose(int[][] A){
        int rows = A[0].length;
        int cols = A.length;
        int[][] transposed = new int[rows][cols];

        for (int i = 0; i < cols; i++){
            for (int j = 0; j < rows ; j++){
                transposed[j][i] = A[i][j];
            }
        }

        return transposed;
    }
}