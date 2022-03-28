import java.util.Arrays;

/*How to Remove Duplicate Elements from an Unsorted Array
 *
 * Input: {5,1,2,6,4,4,5}//Duplicate
 * Output:{5,1,2,6,4}//Unique element
 * */
public class RemoveDuplicateElementsFromUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 6, 4, 4, 5,7};
        removeDuplicateUsingShorting(arr);
    }

    private static void removeDuplicateUsingShorting(int[] arr) {
        Arrays.sort(arr);

        int len = arr.length;
        int j = 0;

        for (int i = 0; i < len - 1; i++) {
            //if value present in i and i+1 is not equal
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[len - 1];

        for (int i = 0; i < j; i++) {
            System.out.println(arr[i] + "");
        }
    }
}
