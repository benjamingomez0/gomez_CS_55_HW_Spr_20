/*     * Assignment #7.1
        * DUE: 04/10/20
        * PURPOSE: returns maximum profit from array of numbers with several trades
        * Benjamin Gomez
        * Section 4107
*/

public class HomeworkAssignment7_2 {
    public static void main(String[] args) {
       Solution sol = new Solution();
    //    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14};
    //    int[] arr1 = {4,2,1};
    //    int[] arr2 = {1};
       int[] arr3 = {1,2,5,1,6};
        // System.out.println(sol.getMaxProfit(arr));
        // System.out.println(sol.getMaxProfit(arr1));
        // System.out.println(sol.getMaxProfit(arr2));
        System.out.println(sol.getMaxProfit(arr3));
      
       // etc.
    }
 }
 class Solution {


    
    /*       *
          * FUNCTION SIGNATURE:  public int getMaxProfit(int[] prices)
          * PURPOSE: returns maximum profit from array of profits
          * @param int[] prices
          * @return int
          *
    */  
    public int getMaxProfit(int[] prices) {
        int count = prices.length;
        int sell = prices[0];
        int buy =prices[0];
        int profit = 0;
        for(int i =1; i<count ; i++)
        {
            if(sell >= prices[i])
            {
                continue;
            }
            else
            {
                if(prices[i] < buy)
                {
                    buy = prices[i];
                }
                if(prices[i]> sell)
                {
                    sell = prices[i];
                    
                }
            }
            profit+=(sell - buy);
        }

       return (profit);
       
    }
 }