/*
 * Find Second-Smallest Number in an array
 *
 * arr = {-1,7,1,34,18}
 * Time complexity O(n log n)
 *
 * */

public class FindSecondSmallestNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {-1, 7, 1, 34, 18};

        System.out.println(getSecondSmallest(arr));
    }

    private static int getSecondSmallest(int[] arr) {
        //Integer.MAX_VALUE = 2147483647
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
