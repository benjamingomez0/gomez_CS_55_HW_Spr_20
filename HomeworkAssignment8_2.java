// /*     * Assignment #8.2
//         * DUE: 05/01/20
//         * PURPOSE: converts a string to an int
//         * Benjamin Gomez
//         * Section 4107
// */
// public class HomeworkAssignment8_2 {
//     public static void main(String args[]) {
//        Solution sol = new Solution();
//        System.out.println(sol.convertString2Integer("123")==123);
//        System.out.println(sol.convertString2Integer("-123")==-123);
//        System.out.println(sol.convertString2Integer("-999")==-999);
//        System.out.println(sol.convertString2Integer("0000012")==12);
//        System.out.println(sol.convertString2Integer("0000000000000124")==124);
 
//     }
//  }
 
//  class Solution {
// /*       *
//           * FUNCTION SIGNATURE: public int convertString2Integer(string input)
//           * PURPOSE: converts a string into int without 
//           * @param STRING input
//           * @return int
//           *
//  */ 
//     public int convertString2Integer(String input)
//     {

//      boolean neg = (input.charAt(0)=='-');
//      int returnNum = 0;
//      int coeficient = 1;
//      for(int i = input.length()-1; neg?i>0:i>=0;i--)
//      {
//          returnNum += (input.charAt(i)-48)* coeficient;
//          coeficient *= 10;
//      }
         
//      if(neg)
//      {
//          returnNum = 0-returnNum;
//      }
       
//      return returnNum;
//     }
//  }