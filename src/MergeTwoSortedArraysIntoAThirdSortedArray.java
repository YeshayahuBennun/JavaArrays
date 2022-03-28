/*
 * Given two sorted arrays, write a code to merge them in a sorted manner.
 *
 * For example:
 *
 * arr1 = {1,5,6,7}
 * arr2 = {2,5,8,9,11}
 *
 * result = {1,2,5,5,6,7,8,9,11}
 * */

import java.util.Arrays;

public class MergeTwoSortedArraysIntoAThirdSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6, 7};
        int[] arr2 = {2, 5, 8, 9, 11};

        int[] result = merge(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] result = new int[len1 + len2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < len1) {
            result[k++] = arr1[i++];
        }

        while (j < len2) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
