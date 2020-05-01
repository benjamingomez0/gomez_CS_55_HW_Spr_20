/*     * Assignment #8.1
        * DUE: 05/01/20
        * PURPOSE: returns reverse of an int.
        * Benjamin Gomez
        * Section 4107
*/


public class HomeworkAssignment8_1 {
    public static void main(String [] args)
    {
      Solution sol = new Solution();
      System.out.println(sol.reverseInt(99)==99);
      System.out.println(sol.reverseInt(-100)==-1);
      System.out.println(sol.reverseInt(Integer.MAX_VALUE)==0);
      

    }

}class Solution {
/*       *
          * FUNCTION SIGNATURE: public int reverseInt(int input)
          * PURPOSE: returns reverse of an integer
          * @param int input
          * @return int
          *
 */  
    public int reverseInt(int input) {
        boolean neg = input < 0 ;
        String str;
        String reversed = "";

        str = neg ? Integer.toString(Math.abs(input)): Integer.toString(input);
        for(int i =str.length()-1 ; i >= 0; i--)
        {
            reversed+=str.charAt(i);

        }
        Long comparison = Long.parseLong(reversed);
        if(comparison>Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            if(neg==true)
            {
                return 0-Integer.parseInt(reversed);
            }
            else
            {
                return Integer.parseInt(reversed);
            }   
        }
    }
 }