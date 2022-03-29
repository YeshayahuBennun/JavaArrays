/*
 * Given an array of integers, write a code to find first
 * and last occurrence/position of a given number.
 *
 * The array is sorted and it contains duplicate element. If target value is not found then
 * return -1.
 *
 * Example:
 * arr[] = {1,4,7,8,8,11,11,11,11,12,13,13}
 * target=11
 *
 * first position = 5
 * last position = 8
 *
 * Time complexity O(log n) Binary search.
 * */
public class FindFirstAndLastIndexOfAnElementInASortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 8, 11, 11, 11, 11, 12, 13, 13};
        System.out.println(findFirstPosition(arr,11));
        System.out.println(findLastPosition(arr, 11));

    }

    private static int findLastPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int index = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;

    }

    private static int findFirstPosition(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        int index = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}
