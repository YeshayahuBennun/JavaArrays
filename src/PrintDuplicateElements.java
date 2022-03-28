/*
* Java program to find Duplicate in Array
*
* Input: {1,5,4,2,1,4,7}
* Output:{1,4}
*
 */

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 1, 4, 7};

        Set<Integer> uniqueNumber = new HashSet<>();
        boolean isDuplicatedExist = false;

        for (int i = 0; i < arr.length; i++) {
            if(uniqueNumber.contains(arr[i])){
                isDuplicatedExist=true;
                System.out.println("Duplicate element "+arr[i]);
            }else {
                uniqueNumber.add(arr[i]);
            }
        }
        if(!isDuplicatedExist){
            System.out.println(-1);
        }
    }
}
