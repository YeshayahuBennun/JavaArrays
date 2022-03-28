/*
 * Reverse an Array
 * */

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }

        System.out.println("Before");
        System.out.println(Arrays.toString(arr));

        int temp;
        int start = 0;
        int n = arr.length;
        int end = n - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("\n\nAfter Reverse");
        System.out.println(Arrays.toString(arr));
    }
}
