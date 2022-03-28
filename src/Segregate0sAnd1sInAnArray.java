/*
 * Segregate 0s and 1s in an array
 *
 * Given an array of 0's and 1's in random order. Write a code to Segregate 0's on left side
 * and 1's on right side of the array.
 *
 * Input arr = [0,1,0,1,0,0,1]
 * Output arr = [0,0,0,0,1,1,1]
 *
 * Complexity O(n)
 * */
public class Segregate0sAnd1sInAnArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0};

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[j++] = arr[i];
            }
        }

        while (j < arr.length) {
            arr[j++] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
