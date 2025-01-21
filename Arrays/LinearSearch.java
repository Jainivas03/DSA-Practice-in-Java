import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter a number for array");
        for(int i=0; i<5; i++){
            num[i]= sc.nextInt();
        }
        System.out.println("Enter a element you want to search");
        int search = sc.nextInt();
        int ans = linearSearch(num, search);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
