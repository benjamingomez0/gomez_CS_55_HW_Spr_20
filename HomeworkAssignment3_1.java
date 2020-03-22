// /**
//  * Assignment #3.1
//  * DUE: 03/13/20
//  * PURPOSE: separates all lowercase a's and b's in a string and returns them in a sorted String
//  * Benjamin Gomez
//  * Section 4107
//  */



// public class HomeworkAssignment3_1 {    
//     public static void main(String[] args) {
//        // Your main() is not graded so you can
//        // have any implementation in this area 
//        Solution sol = new Solution();
//        System.out.println(sol.separateLetters("babbaa")); //outputs "aaabbb"
//        System.out.println(sol.separateLetters("abbbbbbbbaaaaaaa")); 
//        System.out.println(sol.separateLetters("a")); 
//        System.out.println(sol.separateLetters("bb")); 
//        System.out.println(sol.separateLetters("ab")); 
//        System.out.println(sol.separateLetters("ba")); 
//     }
// }
// class Solution {
//     /*     *
//         * FUNCTION SIGNATURE:
//         * public String separateLetters(String input)
//         * PURPOSE: returns the length of the smallest word in the array
//         * @param String [] input
//         * @return String 
//         *
//     */ 

//     public String separateLetters(String input)
//     {
//         char splitArr[] = new char[input.length()];
//         String newStr = "";

//         for(int i=0;i<input.length();i++)
//         {
//             splitArr[i]= input.charAt(i);
//         }
//     //used the insertion sort here, since I can't use the Arrays.Sort() method
//         for(int i = 1; i<input.length() ; i++)
//         {   char currentChar = splitArr[i];
//             int j= i-1;
//             while(j>=0 && splitArr[j] > currentChar)
//             {
//                 splitArr[j+1] = splitArr[j];
//                 j = j-1;
//             }
//             splitArr[j+1]= currentChar;
//         }

//         for(int i=0;i<input.length();i++)
//         {
//            newStr+= splitArr[i];
//         }

//        return(newStr);
//     }
// }