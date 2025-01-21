import java.util.*;

public class PairSum {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 6;
        System.out.println("Pair sum count: " + pairSum(arr, x));

        // Example for threeSum
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println("Three sum result: " + threeSum(nums));
    }

    // Pair sum method
    public static int pairSum(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }

    // Three sum method
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // Sort the array
        int n = nums.length;
        int targetSum = 0; // Target sum for threeSum problem
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            int target = targetSum - nums[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates for left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return ans;
    }
}
