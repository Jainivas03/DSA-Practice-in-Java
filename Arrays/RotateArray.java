
import java.util.* ;

class RotateArray {
        static void rotatearray(int[] arr, int n, int k){
            reversearray(arr, 0, k-1);
            reversearray(arr,k, n-1);
            reversearray(arr,0, n-1);
        }
        static void reversearray(int arr[], int start, int end){
            while(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        static void printarray(int arr[], int n){
            for(int i = 0; i<n; i++){
                System.out.println(arr[i] + " ");
            }
        }

        public static void main(String args[]) {

            // Write code here
            Scanner sc = new Scanner(System.in);
            int n, k, i;
            n = sc.nextInt();
            int[] arr = new int[n];
            for(i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            k = sc.nextInt();
            rotatearray(arr, n, k);
            printarray(arr, n);

        }
    }


