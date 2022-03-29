/*
 * Given an array of integers, find the second-largest number in an array
 *
 * Example 1:
 *
 * Input: {-1,7,1,34,18}
 * Output: 18;
 *
 * Example 2:
 *
 * Input: {1,1,1}
 * Output: "Second largest does not exist".
 *
 * */

import java.util.Arrays;

public class FindSecondLargestNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {-1, 7, 1, 34, 18};
        //int[] arr = {-1, 70, 10, 34, 78};
        //int[] arr = {1, 1, 1};

        //printSecondLargestUsingSorting(arr);
        //The best way.
        printSecondLargest(arr);
    }

    private static void printSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Second largest does not exist");
            return;
        }
        //Integer.MIN_VALUE = -2147483648
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        //{-1,7,1,34,18}
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest does not exist");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }

    private static void printSecondLargestUsingSorting(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            System.out.println("Second largest does not exist");
            return;
        }
        Arrays.sort(arr);
        int secondLargest = arr[n - 2];

        System.out.println("Second largest: " + secondLargest);
    }
}
