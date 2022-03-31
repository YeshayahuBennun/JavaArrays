/*
 * Given an array of integers, write a code to find all unique triplets
 * in the array which gives the sum of zero.
 *
 * Note: The solution set must not contain duplicate triplets.
 *
 * Example 1:
 *
 * Input:{-1,0,1,2,0,-1,-4}
 * Output:{-1,0,1} , {-1,1,2}
 *
 * Example 2:
 *
 * Input:{-8,-7,5,2}
 * Output:{-7,5,2}
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTripletsWithZeroSum3Sum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(arr);

        System.out.println(result);
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int start = i + 1;
            int end = arr.length - 1;

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            while (start < end) {
                if (end < arr.length - 1 && arr[end] == arr[end + 1]) {
                    end--;
                    continue;
                }
                if (arr[i] + arr[start] + arr[end] == 0) {
                    List<Integer> val = Arrays.asList(arr[i], arr[start], arr[end]);
                    result.add(val);
                    start++;
                    end--; 
                } else if (arr[i] + arr[start] + arr[end] < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}
