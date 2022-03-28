/*
 * Given an array of positive numbers and a positive number 'k',
 * find the maximum sum of any sub-array of size k
 *
 * Input: arr[]={2,1,5,1,3,2}
 * k=3
 *
 * Output: 9
 * The sub-array is (5,1,3)
 * */
public class FindMaximumSumOfASubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(getSum(arr, k));
    }

    private static int getSum(int[] arr, int k) {
        int start = 0;
        int sum = 0;
        int maxSum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            if (end >= k - 1) {
                maxSum = Math.max(sum, maxSum);
                sum -= arr[start];
                start++;
            }

        }
        return maxSum;
    }
}
