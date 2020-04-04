 /*     * Assignment #6.2
        * DUE: 04/3/20
        * PURPOSE: determines if two strings are anagrams 
        * Benjamin Gomez
        * Section 4107
*/

import java.util.*;


public class HomeworkAssignment6_2 {
    public static void main(String[] args) {
       Solution sol = new Solution();
       System.out.println(sol.isAnagram("smc","SM C")==true);
       System.out.println(sol.isAnagram("smc","      ")==false);
       System.out.println(sol.isAnagram("123", "123")==true);
       System.out.println(sol.isAnagram("School             master", "The classroom")==true);
     
    }
 }
 class Solution {
    
    public boolean isAnagram(String str1, String str2) {
        //find lower case of both strings
        String lower1 = str1.toLowerCase();
        String lower2 = str2.toLowerCase();

        // split string into array and sort them for comparison later. 
        String split1 [] = lower1.split("",-2);
        Arrays.sort(split1);

        String split2 [] = lower2.split("",-2);
        Arrays.sort(split2);

        //find last occurrence of spaces to see where to begin comparison. 
        lower1="";
        for(int i=0;i<split1.length;i++)
        {
            lower1+=split1[i];
        }
       int k = lower1.lastIndexOf(" ")+2;
       
        lower2="";
        for(int i=0;i<split2.length;i++)
        {
            lower2+=split2[i];
        }
       int l = lower2.lastIndexOf(" ")+2;

       if((k==split1.length && l!=split2.length)||(k!=split1.length&& l==split2.length))
       {
           return false;
       }

        for(int i = 0 ; k < Math.min(split1.length, split2.length) && l < Math.min(split1.length, split2.length); i++)
        {  
            if(split1[k].equals(split2[l])==false)
            {
               return false;
            }
            k++;
            l++;

        }
       return true;
    }
 }