// /*     * Assignment #12.1
//         * PURPOSE: displays max amount of water able to be collected
//         * Benjamin Gomez
//         * Section 4107
// */

// public class HomeworkAssignment12_1 {
//     public static void main(String args[]) {
//        Solution sol = new Solution(); 
//        System.out.println(sol.getTotalWaterAmount(new int[]{5,2,1,2,1,5})==14);
//        System.out.println(sol.getTotalWaterAmount(new int[]{0,1,0})==0);
//        System.out.println(sol.getTotalWaterAmount(new int[]{1,2,3,4,5,6,5,4,3,6,22,3,2})==6);
//        // etc
//     }
//  }

//  class Solution {
// /*       *
//           * FUNCTION SIGNATURE: getTotalWaterAmount(int[] arr)
//           * PURPOSE: takes in array of heights and calculates total water able to be collected 
//           * @param  int[] arr
//           * @return int 
//           *
//  */
//     int getTotalWaterAmount(int[] arr)
//     {
//         //set return value
//        int water = 0;

//        // find max of left wall 
//        for(int i = 1; i< arr.length-1; i++)
//        {
//            int l = arr[i];

//            for(int j = 0; j<i;j++)
//            {    if(arr[j]>l)
//                 {
//                     l= arr[j];
//                 } 
//            }
//            //find max of right wall 
//            int r = arr[i];
//            for(int j = i+1;j<arr.length;j++)
//            {
//                 if(arr[j]>r)
//                 {
//                     r= arr[j];
//                 }            
//            }
//         // subtract lowest from highest and subtract from current
//         // add to water total
//         int min = l<r?l:r;
//            water+= min-arr[i];
                      
//        }
//         return water;
//     }
//  }; 