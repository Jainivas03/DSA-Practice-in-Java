public class DiagonalSum {
    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];  // Primary diagonal
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];  // Secondary diagonal
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Diagonal Sum: " + diagonalSum(matrix));
    }
}
