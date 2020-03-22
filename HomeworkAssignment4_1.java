/**
  * Assignment #4.1
  * DUE: 03/27/20
  * PURPOSE: returns length of shortest palindrome 
  * Benjamin Gomez
  * Section 4107
  */


public class HomeworkAssignment4_1 {
    public static void main(String[] args) {
       Solution sol = new Solution();
       System.out.println(sol.getShortestLength(121));
    //    System.out.println(sol.getShortestLength(1));
    //    System.out.println(sol.getShortestLength(99));
    //    System.out.println(sol.getShortestLength(133));
       System.out.println(sol.getShortestLength(12393));
       System.out.println(sol.getShortestLength(123));
       System.out.println(sol.getShortestLength(-234));
    //    System.out.println(sol.getShortestLength(1222331));
       
    }
 }
 class Solution {
     /*       *
         * FUNCTION SIGNATURE: public boolean isPalindrome(String str)
         * PURPOSE: checks to see if string is a boolean and returns true or false depending on the answer
         * @param String str
         * @return boolean
         *
 */ 
     public boolean isPalindrome(String str)
     {
        boolean isPalindrome = true;
         int low = 0;
         int high = str.length()-1;
         while(low<high)
         {
             if( str.charAt(low) != str.charAt(high))
             {
                 isPalindrome = false;
                 break;
             }
             low++;
             high--;
         } 
         return isPalindrome;
     }
/*       *
         * FUNCTION SIGNATURE: public int getShortestLength(int n)
         * PURPOSE: Takes in an arbitrary number, n, and appends zero (0) or more numeric digits at the end. returns a 
         * integer denoting the length of the shortest palindrome
         * @param int n
         * @return int
         *
 */  
    public int getShortestLength(int n) 
    {
       // global variables for ease 
       String str = Integer.toString(n);
       int pivot = str.length()/2;
       int len = str.length();
       int lastIndex = len-1; 

       //checks edge cases of single digit numbers or negative numbers

       if(n<10)
       {
            if(n<0)
            {
                return 0;
            }
            return 1;
        }

       //first see if it is already a palindrome. If so, return length of the stringified number.

       if(isPalindrome(str))
       {
           return str.length();
       }
      
       if(str.charAt(pivot)==str.charAt(lastIndex))
        {
            int i = pivot-1;
            while(i >= 0 && isPalindrome(str)==false)
            {
                str+=str.charAt(i);
                i--;
            }
        }
        else
        {
            int i = lastIndex-1;
            while(i >= 0 && isPalindrome(str)==false)
            {
                str+=str.charAt(i);
                i--;
            }
        }
       return str.length(); 
     
    }
 }