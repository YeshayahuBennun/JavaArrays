/*
 * Given a sorted array consisting of only integers where every element appears
 * twice except for one element which appears once.Find this single element that appears
 * only once.
 *
 * Example1:
 *
 * Input: [1,1,2,3,3,4,4,8,8]
 * Output: 2
 *
 * Example2:
 *
 * Input: [3,3,7,7,10,11,11]
 * Output: 10
 * */

import java.util.HashMap;
import java.util.Map;

public class FindTheElementThatAppearsOnceInAnArray {
    public static void main(String[] args) {
       // int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] arr = {3,3,7,7,10,11,11};

        System.out.println(SingNonDuplicateUsingMap(arr));
    }

    private static int SingNonDuplicateUsingMap(int[] arr) {
        int res = 0;

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);

        }

        System.out.println(countMap);

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                res = entry.getKey();
                break;
            }
        }

        return res;
    }
}
