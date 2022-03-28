/*
 * Example1:
 * arr={5,6,1,2,3,4}
 * Minimum element is 1
 *
 * Example2:
 * arr={11,2,3,4,5,6,7,8}
 * Minimum element is 2
 *
 * You may assume no duplicate exists in the array
 *
 * */
public class FindMinimumElementInASortedAndRotatedArray {
    public static void main(String[] args) {
        //int[] arr = {5, 6, 1, 2, 3, 4};
        int[] arr = {11, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] arr) {
        //If the array has only one element arr={1}
        if (arr.length == 1) {
            return arr[0];
        }

        int start = 0;
        int end = arr.length - 1;

        //If the array is sorted, arr ={1,2,3,4}
        if (arr[0] < arr[end]) {
            return arr[0];
        }

        while (start <= end) {
            int mid = start + end / 2;

            if (start < mid && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (end > mid && arr[mid + 1] < arr[mid]) {
                return arr[mid + 1];
            } else if (arr[end] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
