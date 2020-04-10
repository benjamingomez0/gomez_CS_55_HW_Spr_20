//  /*     * Assignment #6.1
//         * DUE: 04/3/20
//         * PURPOSE: Left shifts elements in array over M number times 
//         * Benjamin Gomez
//         * Section 4107
// */

// public class HomeworkAssignment6_1 {

//     public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14};
//        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
//        // you may use, for example, Arrays to print array elements in 
//        // one fell swoop or see HOW TO TEST below
//        sol.leftShiftElements(arr,1256);
//        sol.leftShiftElements(arr2, 56);

//        for(int i = 0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("");
//        for(int i = 0;i<arr2.length;i++)
//        {
//            System.out.print(arr2[i]+" ");
//        }
    
//     }
//  }
//  class Solution {
// /*        *
//           * FUNCTION SIGNATURE: void shiftOne(int[] arr)
//           * PURPOSE: shifts the array to the left once  
//           * @param int[] arr
//           * @return void
//           *
// */ 
//     public static void shiftOne(int[] arr)
//     {
//         //assigns temp variable to hold array element zero
//         int temp =arr[0];
//         //assign every element the value of adjacent element except last one. 
//         for(int i = 0; i< arr.length-1;i++)
//         {
//             arr[i]=arr[i+1];
//         }
//         //assign last element temp value
//         arr[arr.length-1]=temp;
//     }
/*       *
          * FUNCTION SIGNATURE:  public void leftShiftElements(int[] arr, int M)
          * PURPOSE: shifts the array m times 
          * @param int[] arr, int M
          * @return void
          *
*/  
//     public void leftShiftElements(int[] arr, int M)
//     {
//         //run the shift one function as many times as M dictates.
//         for(int i =0;i<M;i++)
//         {
//             shiftOne(arr);
//         }
//     }
//  }