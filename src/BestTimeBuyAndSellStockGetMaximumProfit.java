/*
 * Given an array of stock prices. At most one transaction is allowed
 * (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 *
 * Note: You cannot sell a stock before you buy one.
 *
 * example1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 *
 * Explanation: Buy on day 2 (price=1) and sell on day 5 (price=6), profit = 6-1 = 5.
 *               Not 7-1 = 6, as selling price needs to be larger than buying price
 * */

public class BestTimeBuyAndSellStockGetMaximumProfit {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]-min>max){
                max=arr[i]-min;
            }
        }
        return max;
    }
}
