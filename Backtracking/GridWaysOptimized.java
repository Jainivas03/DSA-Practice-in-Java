public class GridWaysOptimized {

    // Function to calculate factorial
    private static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long gridWays(int m, int n) {
        return factorial(m - 1 + n - 1) / (factorial(m - 1) * factorial(n - 1));
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(gridWays(m, n));
    }
}
