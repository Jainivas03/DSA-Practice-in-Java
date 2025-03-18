public class NQueensOneSolution {
    public static boolean solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board) {
            java.util.Arrays.fill(row, '.');
        }
        if (backtrack(board, 0)) {
            printBoard(board);
            return true;
        } else {
            System.out.println("No solution exists.");
            return false;
        }
    }

    private static boolean backtrack(char[][] board, int row) {
        if (row == board.length) {
            return true; // Found a solution
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                if (backtrack(board, row + 1)) {
                    return true; // Stop once a solution is found
                }
                board[row][col] = '.'; // Backtrack
            }
        }

        return false;
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        // Check left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // Check right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        if (!solveNQueens(n)) {
            System.out.println("No solution exists.");
        }
    }
}
