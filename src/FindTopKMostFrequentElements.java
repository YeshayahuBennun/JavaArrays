import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given a non-empty array of integers, return the k most frequent elements.
 *
 * Example 1:
 *
 * Input: arr={1,1,1,2,2,3,3,3}, k=2
 * Output: arr = {1,3}
 *
 * Example 2:
 *
 * Input: arr={1}, k=1
 * Output = {1}
 * */
public class FindTopKMostFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3};
        //int[] arr = {1};
        int k = 2;

        System.out.println(kMostFrequent(arr, k));
    }

    private static List<Integer> kMostFrequent(int[] arr, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxFreq = 0;

        for (int i = 0; i < arr.length; i++) {
            //Get the occurrence of current element and 1 to it
            int freq = countMap.getOrDefault(arr[i], 0) + 1;
            //put the element and its freq in a map
            countMap.put(arr[i], freq);
            //keep track of maximum occurrence
            maxFreq = Math.max(maxFreq, freq);
        }

        List<Integer>[] bucket = new List[maxFreq + 1];

        for (int n : countMap.keySet()) {
            int freq = countMap.get(n);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(n);
        }

        List<Integer> res = new ArrayList<>();
        //Pick top k elements 
        for (int i = bucket.length - 1; i >= 0 && k > 0; i++) {
            if (bucket[i] != null) {
                List<Integer> list = bucket[i];
                res.addAll(list);
                k-=list.size();
            }

        }
        return res;
    }
}
