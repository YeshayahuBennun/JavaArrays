/*
 * Given an array of integers, find maximum difference between two elements such that
 * larger number appears after the smallest number.
 *
 * Example 1:
 *
 * arr = {2,5,15,6,4}
 * Output = 13
 *
 * Example 2:
 *
 * arr = {7,9,5,6,13,2}
 * Output = 8
 *
 * */
public class FindMaximumDifferenceBetweenTwoArrayElements {
    public static void main(String[] args) {
        //int[] arr = {2, 5, 15, 6, 4};
        int[] arr = {7,9,5,6,13,2};

        //Worst way and not recommended.
        System.out.println(bruteForce(arr));

        //The best way
        System.out.println(findMaxDiff(arr));
    }

    private static int findMaxDiff(int[] arr) {
        int maxDiff = arr[1] - arr[0];
        int minElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - minElement) > maxDiff) {
                maxDiff = arr[i] - minElement;
            }
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return maxDiff;
    }

    private static int bruteForce(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = Math.max(max, arr[j] - arr[i]);
                }
            }
        }
        return max;
    }
}
