import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        Integer[] arr = {64, 25, 12, 22, 11};

        // Full Sort
        Arrays.sort(arr);
        System.out.println("Full Sorted: " + Arrays.toString(arr));

        // Range Sort (index 1 to 4)
        Arrays.sort(arr, 1, 4);
        System.out.println("Range Sorted: " + Arrays.toString(arr));

        // Reverse Sort
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Reverse Sorted: " + Arrays.toString(arr));
    }
}
