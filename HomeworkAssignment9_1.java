/*     * Assignment #8.2
        * DUE: 05/08/20
        * PURPOSE: returns number of possible addresses made given an array of strings and a strinkg
        * Benjamin Gomez
        * Section 4107
*/

import java.util.*;

public class HomeworkAssignment9_1 {
    public static void main(String args[]) {
       Solution sol = new Solution();
       System.out.println(sol.getNumPossibleSigns("AAAABCCC123456789", new String[]{"123C","123A","123 ADA"})  + "<=== expected 2");
       System.out.println(sol.getNumPossibleSigns("A", new String[]{"S","M","C"}) + "<=== expected 0" );
       System.out.println(sol.getNumPossibleSigns("ABCDEFGHIJKLMNORSTUVWXYZ1234567890", new String[]{"2 FIRST ST"," 13 PUN ST", "101 AKER"}) + "<=== expected 0" );
       System.out.println(sol.getNumPossibleSigns("ABCDAAST", new String[]{"999 S ST", "A BAD ST", "B BAD ST"}) + "<=== expected 1" );
       
    }
 }
 
 class Solution {
/**
 * MEMBER FUNCTION NAME: 
 *    checkStock
 * PURPOSE: 
 *    The function takes in one string representing a single address and checks each char against the available stock in the 
 *    ascii hash
 * PARAMETER:
 *    String   addr
 *    String[] asc
 * RETURN VALUE:
 *    int: if the word can be made it returns a 1 otherwise a zero 
 */
   int checkStock(int [] asc, String addr)
   {
      //copy the ascii hash so i can manipulate the hash
      int [] newArr = Arrays.copyOf(asc, asc.length);
      int count =0;

      for(int j =0; j< addr.length();j++)
      {
         //if there is no longer a letter, break and return 0
         if(newArr[(int) addr.charAt(j)] == 0 & addr.charAt(j) != ' ' )
         {
            break;
         }
         else
         {
            newArr[(int) addr.charAt(j)]--;

            if(j == addr.length()-1)
            {
               count++;
            }
         }
      }
     
      return count;
   }
/**
 * MEMBER FUNCTION NAME: 
 *    getNumPossibleSigns
 * PURPOSE: 
 *    The function takes in a series of addresses in a string array and compares each of them with the available 
 *    letterInventory, returning the number of addresses that are POSSIBLE to form from the given letterInventory
 * PARAMETER:
 *    String   letterInventory
 *    String[] addresses
 * RETURN VALUE:
 *    int: the number of possible addresses that can be formed from your inventory of letters
 */
    int getNumPossibleSigns(String letterInventory, String[] addresses) {
     int [] ascii = new int [128];
     int count = 0;
    
     for(int i= 0; i< letterInventory.length(); i++)
     {
        //loop through letter inventory and add 1 to each index
        ascii[ (int)letterInventory.charAt(i) ]++;
     }
     for(int i = 0 ; i < addresses.length; i++ )
     {
        count += checkStock(ascii,addresses[i]);
     }
       return count;
    }
 }