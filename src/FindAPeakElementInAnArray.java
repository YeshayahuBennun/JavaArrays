/*
 * Given an array of integers, find a peak element. The array may contain
 * multiple peak elements, in that case return anyone peak element.
 *
 * Peak element - An element which is grater than its neighbours.
 *
 * Example 1:
 *
 * Input: {2,3,4,7,5}
 * Output:7
 *
 * Example 2:
 *
 * Input: {8,7,6,5,4}
 * Output:8
 *
 * Example 3:
 *
 * Input:{2,3,4,5,6}
 * Output:6
 *
 * Example 4:
 *
 * Input:{2,2,2,2,2}
 * Output:2
 *
 * In that case every element is a peak element. so return the index of any element.
 *
 * */

public class FindAPeakElementInAnArray {
    public static void main(String[] args) {
        //int[] arr = {2, 3, 4, 7, 5};
        int[] arr = {2,3,4,5,6};

        System.out.println(findPeakElement(arr));
    }

    //Binary Search
    private static int findPeakElement(int[] arr) {
        int n = arr.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                    (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return arr[mid];
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
