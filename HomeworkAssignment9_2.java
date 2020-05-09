// /*     * Assignment #8.2
//         * DUE: 05/08/20
//         * PURPOSE: Takes Excel spreadsheet column title as input, and computes its corresponding column number in integer
//         * Benjamin Gomez
//         * Section 4107
// */

public class HomeworkAssignment9_2 { 
    public static void main(String args[]) { 
       Solution sol = new Solution(); 
       System.out.println(sol.convertExcelTitleToNumber("ABCDEF")); 
       System.out.println(sol.convertExcelTitleToNumber("A"));
       System.out.println(sol.convertExcelTitleToNumber("AAA"));
       System.out.println(sol.convertExcelTitleToNumber("AB"));
      
    }
 }

 class Solution {
     
/*       *
          * FUNCTION SIGNATURE: int convertExcelTitleToNumber(String s)
          * PURPOSE: Takes Excel spreadsheet column title as input, and computes its corresponding column number in integer
          * @param STRING s
          * @return int
          *
 */ 
    int convertExcelTitleToNumber(String s) {
       //set up return value;
        int columnNum = 0; 
        for (int i = 0; i < s.length(); i++) 
        { 
            // Pretty much every letter you add is multiplying by 26. the cells go in cycles of 26
            columnNum *= 26; 

            // after you multiply, you add the value of what the letter is. you can do this by Subtracting the chars
            //add one because columns go from 1-26 not 0-26
            columnNum += s.charAt(i) - 'A' + 1; 
        } 
      
        return columnNum; 
       
    }
 }