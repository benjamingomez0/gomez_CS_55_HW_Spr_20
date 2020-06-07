/*     * Assignment #12.2
        * PURPOSE: displays max area of a pond given different depths
        * Benjamin Gomez
        * Section 4107
*/

public class HomeworkAssignment12_2 {
    public static void main(String args[]) {
       Solution sol = new Solution(); 
       System.out.println(sol.getMaxPond(new int[]{1})==0);
       System.out.println(sol.getMaxPond(new int[]{22,31,1,23})==66);
       System.out.println(sol.getMaxPond(new int[]{1,3,5})==3);
       System.out.println(sol.getMaxPond(new int[]{3,2,1})==2);
    }
 }

 
 class Solution {
/*  *
    * FUNCTION SIGNATURE: getMaxPond(int[] arr)
    * PURPOSE: displays max area of a pond given different depths 
    * @param  int[] arr
    * @return int 
    *
 */
    int getMaxPond(int[] arr)
    {
        //if only 1 element return 0
       if(arr.length == 0 )
       {
            return 0;
       }
       //max area declared
       int maxArea =0; 
       
       // this loops through the array comparing the area created by all the elements in the array;
       for(int i =0, j=arr.length-1; i <= j; i++, j--)
       {
           int height = arr[i]>arr[j]?arr[j]:arr[i];
           int currArea = (height*j);
           
           if(maxArea<currArea)
           {
               maxArea = currArea;
           }
       }

       return maxArea;
    }
 };