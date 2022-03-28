/*
 * Given an integer array, find the contiguous sub array (containing at least one number)
 * which has the largest sum and return its sums.
 *
 * Example 1:
 *
 * arr[] = {1,2,-5,4,3,8,5}
 *
 * Result: 20
 * The sub array is: (4,3,8,5)
 *
 * Example 2:
 *
 * arr[]= {-2,-1}
 * Result = -1
 * the sub array is: -1
 * */

public class FindMaximumSubArraySum {
    public static void main(String[] args) {
        //int[] arr = {1, 2, -5, 4, 3, 8, 5};
        int[] arr = {-2, -1};

        System.out.println(findMaxSubArraySum(arr));
    }

    private static int findMaxSubArraySum(int[] arr) {
        int maxSum = arr[0];
        int sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) {
                sum = arr[i];
            } else {
                sum = sum + arr[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
