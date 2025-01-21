import java.util.Scanner;

public class CountInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(inversionCount(arr, 0, n - 1));
    }

    private static int inversionCount(int[] arr, int l, int r) {
        int res = 0;
        if(l < r) {
            int mid = l + (r - l) / 2;
            res += inversionCount(arr, l, mid);
            res += inversionCount(arr, mid + 1, r);
            res += countAndMerge(arr, l, mid, r);
        }
        return res;
    }

    private static int countAndMerge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1, n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i < n1; i++){
            left[i] = arr[i + l];
        }
        for(int j = 0; j < n2; j++){
            right[j] = arr[j + mid + 1];
        }
        int res = 0;
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
                res += n1 - i;
            }
        }
        while(i < n1){
            arr[k++] = left[i++];
        }
        while(j < n2) {
            arr[k++] = right[j++];
        }
        return res;
    }
}
