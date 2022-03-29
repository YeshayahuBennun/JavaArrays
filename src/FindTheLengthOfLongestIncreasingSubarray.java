/*
 * Given an unsorted array of integers, find the length of longest increasing subarray.
 *
 * Example 1:
 *
 * Input:{1,2,6,0,7}
 * Output:3
 *
 * Explanation: Longest increasing subarray is {1,2,6}
 *
 * Example 2:
 *
 * Input:{1,9,3,4,7,2,6,8}
 * Output:3
 *
 * Explanation: Longest increasing subarray is {3,4,7} or {2,6,8}
 * */
public class FindTheLengthOfLongestIncreasingSubarray {
    public static void main(String[] args) {
        //int[] arr = {1, 9, 3, 4, 7, 2, 6, 8};
        int[] arr = {1,9,3,4,7,2,6,8};

        System.out.println(findLength(arr));
    }

    private static int findLength(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int len = 1;
        int maxLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                len++;
            } else {
                len = 1;
            }
            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}
