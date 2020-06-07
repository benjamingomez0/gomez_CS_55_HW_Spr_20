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
       if(arr.length == 0 )
       {
            return 0;
       }
       int maxArea =0; 
       
       for(int i =0, j=arr.length-1; i <= j; i++, j--)
       {
           int currArea = (Math.min(arr[i],arr[j]))*(j);
           if(maxArea<currArea)
           {
               maxArea = currArea;
           }
       }

       return maxArea;
    }
 };