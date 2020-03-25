/**
  * Assignment #4.2
  * DUE: 03/27/20
  * PURPOSE: sanitizes all consecutive duplicates in a  string.
  * Benjamin Gomez
  * Section 4107
  */

public class HomeworkAssignment4_2 {
    public static void main(String args[]) {
       Solution sol = new Solution();
       System.out.println(sol.deduplicate("AABB")); // should output "Empty"
       System.out.println(sol.deduplicate("A"));    // "A"
       System.out.println(sol.deduplicate("ABBA")); // should output "Empty"
       System.out.println(sol.deduplicate("AAA"));  // "A"
       System.out.println(sol.deduplicate("AKA"));  // "AKA" because there is no consecutive pair.
    }
 }
 class Solution {
/*       *
         * FUNCTION SIGNATURE: public String createNewString(String str)
         * PURPOSE: returns new string that removes 1 sequential dupe 
         * @param: String str
         * @return:  String
         *
*/
    public String createNewString(String str)
    {
        String newStr = "";
        int len = str.length();
        
        for(int i=0 ; i< len-1 ; i++ )
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                if(i== 0)
                {
                    newStr = str.substring(i+2, len);
                    if(newStr.length()==0)
                    {
                        newStr= "Empty";
                    }
                    return newStr;
                }
                else
                {
                    newStr += str.charAt(i-1);
                    newStr+=str.substring(i+2, len);
                    break;
                }
            }
        }
        return newStr;
    }
 /*       *
         * FUNCTION SIGNATURE: public boolean hasNoDupes(String str)
         * PURPOSE: determines if input string has an adjacent duplicate substring
         * @param String str
         * @return boolean 
         *
*/
    public boolean hasNoDupes(String str)
    {   
        if(str.length() == 0)
        {
            return true;
        }
        int count = 0;
        while(count<str.length()-1)
        {
            if(str.charAt(count)==str.charAt(count+1))
            {
                return false;
            }
            count++;
        }
        return true;
    }
/*       *
         * FUNCTION SIGNATURE: public String deduplicate(String input)
         * PURPOSE: Sanitizes all consecutive duplicates in a  string and returns result
         * @param String input
         * @return String 
         *
*/  
    public String deduplicate(String input) {
        String returnStr = "Empty";
        if(hasNoDupes(input))
        {
            return input;
        }
        else
        {

            returnStr = createNewString(input);
            boolean flag = hasNoDupes(returnStr);

            if(flag)
            {
                return returnStr;
            }
            else
            {   
                while(!flag)
                {
                    returnStr = createNewString(returnStr);
                    flag = hasNoDupes(returnStr);
                }
            }

            
        }

       
    //    String truefalse = String.valueOf(hasNoDupes(input));
       return returnStr;
    }
 }