/**
 * Assignment #3.2
 * DUE: 03/13/20
 * PURPOSE: Determines if player can always win a game of removing n stones
 * Benjamin Gomez
 * Section 4107
 */


public class HomeworkAssignment3_2 {    
    public static void main(String[] args) {
       // Your main() is not graded so you can
       // have any implementation in this area 
       Solution sol = new Solution();
       // Test#1
       System.out.println(sol.canIAlwaysWin(2)); //outputs true
       // Test#2
       System.out.println(sol.canIAlwaysWin(6)); //outputs false
  }
}
class Solution {
/*         *
//         * FUNCTION SIGNATURE: public boolean canIAlwaysWin(int n)
//         * PURPOSE: determines if game can be won given an initial amount of tokens
//         * @param int n
//         * @return boolean 
//         *
*/ 
    public boolean canIAlwaysWin(int n) {
        // This solution does not work
      if(n<=5)
      {
          return true;
      }
      else if(n%2!=0)
      {
          while(n>0)
          
        if(n % 5 >= 1)
        {
            return true;
        }
        if(n % 4 >= 1)
        {
            return true;
        }
        if(n % 3 >= 1)
        {
            return true;
        }
        if(n % 2 >= 1)
        {
            return true;
        }
        if(n % 1 >= 1)
        {
            return true;
        }
      }
        return false;
        
    }
}