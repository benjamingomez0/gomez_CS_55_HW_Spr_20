

/**
 * Assignment #2.2
 * DUE: 03/6/20
 * PURPOSE: Input an array of strings and find the largest common prefix denominator in an array of English words. 
 * Benjamin Gomez
 * Section 4107
 */

public class HomeworkAssignment2_2 {
    public static void main(String args[]) {
       Solution sol = new Solution();
       String[] set = {"abas","dca","tie"};
       String[] set2 = {"ate","cate","kate"};
       String[] set3 = {"os","las","let"};
       String[] set4 = {"lobotamy","lobo","lobor"};
       String[] set5 = {"cate","cat","category"};
       String[] set6 = {"los","las","let"};
       String[] set7={};
       String[] set8 = {"los","los","los"};
       String[] set9 = {"los","los","lr"};


    }
}
class Solution{

    /**
    * FUNCTION SIGNATURE:
    * int checkEdgeCases(String[] words)
    * PURPOSE: returns a specific integer depending on the edge cases that may present themselves
    *          checks an empty array and an array of 1 word. also checks if they are all the same word.
    *          
    * @param String [] words
    * @return integer
    */ 

    public int checkEdgeCases(String [] wordSet)
        {
            int arrLen = wordSet.length;
            int firstWordCount = 1; 
            if(arrLen == 0)
            {
                return(1);
            }
            else if(arrLen==1)
            {
                return(2);
            }
            else
            {
                for(int i =0; i < arrLen-1 ; i++)
                {

                    if(wordSet[0].equals(wordSet[i+1]))   
                    {
                        firstWordCount++;
                    }
                }   
                if(firstWordCount==arrLen)
                {
                    return(2);
                }
                return(999);
            }            
        }

    /**
    * FUNCTION SIGNATURE:
    * int minWordLen(String [] wordSet)
    * PURPOSE: returns the length of the smallest word in the array
    * @param String [] words
    * @return integer
    */ 

    public int minWordLen(String [] wordSet)
    {
        int min = wordSet[0].length();
        for(int i = 0; i<wordSet.length;i++)
        {
            if(wordSet[i].length()<min)
            {
                min = wordSet[i].length();
            }
        }
        return(min);
    }
    /**
    * FUNCTION SIGNATURE:
    * String getLargestPrefix(String[] words)
    * PURPOSE: Input an array of strings and find the largest common prefix denominator in an array of English words.
    * @param String [] words
    * @return Prefix string
    */ 
    public String getLargestPrefix(String[] words)
        {
            int arrLen = words.length;
            int indexOfLastMatch = -999;
            boolean mismatchFlag = false;
            int j = 1;
            String returnString ="";

            if(checkEdgeCases(words)==1)
            {
                return("");
            }
            else if(checkEdgeCases(words)==2)
            {
                return(words[0]);
            }
           
            int minLen = minWordLen(words);

            for(int i =0; i<arrLen-1;i++)
            {
                for( int k =0;k< minLen;++k)
                {
                    if(words[i].charAt(k)!=words[j].charAt(k))
                    {
                        mismatchFlag=true;
                    }
                    else if(words[i].charAt(k)==words[j].charAt(k) && mismatchFlag == false)
                    {
                        indexOfLastMatch= k;
                    }
                }
                j++;
            }

            if(indexOfLastMatch!=-999)
            {
                returnString= words[0].substring(0,(indexOfLastMatch+1));                
            }
         
            return(returnString);
        }
    }

