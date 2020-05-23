// /*     * Assignment #11.1
//         * DUE: 05/22/20
//         * PURPOSE: Takes in a string and displays an int with number of occurrences of digit
//         * Benjamin Gomez
//         * Section 4107
// */

public class HomeworkAssignment11_1 {
    public static void main(String args[]) {
       Solution sol = new Solution(); 
       System.out.println(sol.countNumber("111")==31);
       System.out.println(sol.countNumber("1000")==1130);
       System.out.println(sol.countNumber("99")==29);
       System.out.println(sol.countNumber("20")==1210);
       System.out.println(sol.countNumber("888")==38);
       System.out.println(sol.countNumber("1")==11);
  
    }
 }
 
 class Solution {
/*       *
          * FUNCTION SIGNATURE:  int countNumber(String str)
          * PURPOSE: takes in a string and displays an int with number of occurrences of digit
          * @param STRING str
          * @return int 
          *
 */ 
    int countNumber(String str) {
        //hash table
        int ascii [] = new int[128];

        //we will add numeric characters to the string below so that we can easily parse it later
        String toBeParsed = "";

        //once parsed, the return in will hold the value
        int returnInt = 0;

        //fill hash with count of occurences of characters
        for(int i = 0; i< str.length();i++)
        {
            ascii[(int)(str.charAt(i))]++;
            
        }

        //loop through string and add the number of occurences to the toBeParsed variable
        //once the occurrence count has been concatenated to the string concat the character at i
        //if the character has more than 1 occurrence, move i forward that many spaces

        for(int i = 0; i< str.length();i++)
        {
        
           if(ascii[ (int)(str.charAt(i))]>1)
           {
            toBeParsed+= ascii[(int)(str.charAt(i))];
            toBeParsed+=str.charAt(i);
            i+=ascii[(int)(str.charAt(i))];
           }
           else
           {
            toBeParsed+= ascii[(int)(str.charAt(i))];
            toBeParsed+=str.charAt(i);
           }
        }

        //parse string and return
        returnInt = Integer.parseInt(toBeParsed);
       return returnInt;
    }
 }; 