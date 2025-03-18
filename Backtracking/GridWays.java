public class GridWays {
    public static int gridWays(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return gridWays(m - 1, n) + gridWays(m, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(gridWays(3, 3));
    }
}
