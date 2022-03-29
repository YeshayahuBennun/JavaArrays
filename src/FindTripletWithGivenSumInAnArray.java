import java.util.Arrays;

/*
 * Given an array of unsorted integers and a value k write a code to determine
 * whether there exist three elements in array whose sum is exactly k.
 *
 * For example
 *
 * Example 1:
 * Input:{1,4,45,6,10,8} k=13
 * Output:true explanation {1,4,8}
 *
 * Example 2:
 * Input:{2,7,4,0,9,5,1,3} k=6
 * Output:true explanation {(2,4,0),(5,1,0),(1,2,3)}
 * */
public class FindTripletWithGivenSumInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 0, 9, 5, 1, 3};
        int k = 13;
        boolean result = findTriplet(arr, k);

        if (result) {
            System.out.println("Exists");
        } else {
            System.out.println("Not exists");
        }
    }

    private static boolean findTriplet(int[] arr, int k) {
        if (arr.length < 3) {
            return false;
        }
        Arrays.sort(arr);
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int start = i + 1;
            int end = len - 1;

            while (start < end) {
                if (arr[i] + arr[start] + arr[end] == k) {
                    return true;
                } else if (arr[i] + arr[start] + arr[end] < k) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return false;
    }
}
