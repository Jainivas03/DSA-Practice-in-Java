public class LargestInArray {
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 8, 5};
        System.out.println("Largest element is: " + findLargest(arr));
    }
}
