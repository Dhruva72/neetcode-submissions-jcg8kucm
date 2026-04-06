class NumMatrix {

    int[][] prefix;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        prefix = new int[m][n];

        // Build prefix matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int top = (i > 0) ? prefix[i - 1][j] : 0;
                int left = (j > 0) ? prefix[i][j - 1] : 0;
                int diag = (i > 0 && j > 0) ? prefix[i - 1][j - 1] : 0;

                prefix[i][j] = matrix[i][j] + top + left - diag;
            }
        }
    }

    public int sumRegion(int r1, int c1, int r2, int c2) {

        int total = prefix[r2][c2];

        int top = (r1 > 0) ? prefix[r1 - 1][c2] : 0;
        int left = (c1 > 0) ? prefix[r2][c1 - 1] : 0;
        int diag = (r1 > 0 && c1 > 0) ? prefix[r1 - 1][c1 - 1] : 0;

        return total - top - left + diag;
    }
}
/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */