public class NQueensCount {
    static int count = 0;

    public static int totalNQueens(int n) {
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n];
        boolean[] diag2 = new boolean[2 * n];
        backtrack(0, n, cols, diag1, diag2);
        return count;
    }

    private static void backtrack(int row, int n, boolean[] cols, boolean[] diag1, boolean[] diag2) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols[col] || diag1[row + col] || diag2[row - col + n - 1]) continue;

            cols[col] = diag1[row + col] = diag2[row - col + n - 1] = true;
            backtrack(row + 1, n, cols, diag1, diag2);
            cols[col] = diag1[row + col] = diag2[row - col + n - 1] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(totalNQueens(5));
    }
}
