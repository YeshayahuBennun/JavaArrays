import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, find the majority element.
 *
 * The majority element is the element that appears more than n/2 times (where n is the size
 * of an array)
 *
 * For example:
 *
 * Input:[3,3,2,2,3,2,3]
 * Output: 3
 *
 * Input:[1,1,4,1,4,4,1,4,4]
 * Output: 4
 * */
public class FindMajorityElementInAnArray {
    public static void main(String[] args) {
        //int[] arr = {3, 3, 2, 2, 3, 2, 3};
        int[] arr = {1,1,4,1,4,4,1,4,4};

        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr) {
        Map<Integer,Integer> countMap = new HashMap<>();
        Integer result = null;

        for (int i = 0; i < arr.length; i++) {
            countMap.put(arr[i],countMap.getOrDefault(arr[i],0)+1);
        }

        int val  = arr.length/2;

        for (Map.Entry<Integer, Integer> entry :
                countMap.entrySet()) {
            if(entry.getValue()>val){
                result = entry.getKey();
                break;
            }
        }

        return result;
    }

}
