/**
 * Assignment #2.2
 * DUE: 03/11/20
 * PURPOSE: Input an array of strings and find the largest common prefix denominator in an array of English words. 
 * Benjamin Gomez
 * Section 4107
 */

public class HomeworkAssignment2_2 {
    public static void main(String args[]) {
       Solutions sol = new Solutions();
       String[] set = {"a","b","c"};
       System.out.println(sol.getLargestPrefix(set));
    }
}
class Solutions{
          /**
    * FUNCTION SIGNATURE:
    * String getLargestPrefix(String[] words)
    * PURPOSE: Input an array of strings and find the largest common prefix denominator in an array of English words.
    * @param String [] words
    * @return Prefix string
    */ 
        public String getLargestPrefix(String[] words) {
           int arrLen = words.length; 
            if(arrLen == 0)
            {
                return("");
            }
            else if(arrLen==1)
            {
                return(words[0]);
            }



            return(words[0]);
        }
    }