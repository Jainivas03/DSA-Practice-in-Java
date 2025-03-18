public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int index, int target) {
        if (index == -1){
            return -1;
        }
        if (arr[index] == target) return index;
        return lastOccurrence(arr, index - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3};
        System.out.println(lastOccurrence(arr, arr.length - 1, 3));
    }
}
