/*
 * Create a function which calculates the sum and product of elements of array.
 * Find the time complexity for created method.*/

public class FindTheSumAndProductOfElementsOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};

        spOfArray(arr);
    }

    private static void spOfArray(int[] arr) {
        int sum = 0;                          //O(1)
        int product = 1;                      //O(1)

        for (int i = 0; i < arr.length; i++) {//O(n)
            sum += arr[i];//O(1)
        }                                                       //=> O(n) complexity

        for (int i = 0; i < arr.length; i++) {//O(n)
            product *= arr[i];
        }

        System.out.println(sum + "," + product);//O(1)
    }


}
