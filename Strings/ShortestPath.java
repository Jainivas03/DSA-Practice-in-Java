public class ShortestPath {
    // Find the shortest path from given 4-direction route (N, S, E, W)
    public static double shortestPath(String route) {
        int x = 0, y = 0;
        for (char dir : route.toCharArray()) {
            if (dir == 'N') y++;
            else if (dir == 'S') y--;
            else if (dir == 'E') x++;
            else if (dir == 'W') x--;
        }
        return Math.sqrt(x * x + y * y); // Distance formula
    }

    public static void main(String[] args) {
        String route = "NESWNESW";
        System.out.println("Shortest path distance: " + shortestPath(route));
    }
}
