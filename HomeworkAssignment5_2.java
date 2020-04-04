// // /**
// //   * Assignment #5.2
// //   * DUE: 04/3/20
// //   * PURPOSE: get secret message by taking the first character from each word in the input sentence, in the order they appear 
// //   * Benjamin Gomez
// //   * Section 4107
// //   */

// public class HomeworkAssignment5_2 {
//     public static void main(String[] args) {
//        Solution sol = new Solution();
//        System.out.println(sol.getSecretMessage("santa monica college")); // prints "smc"
//        System.out.println(sol.getSecretMessage("     "));                    // prints nothing
//        System.out.println(sol.getSecretMessage("santa monica"));         // prints "sm"
       
//     }
//  }
//  class Solution {
// /*

//      * FUNCTION SIGNATURE: String getSecretMessage(String str)
//      * PURPOSE: get secret message by taking the first character from each word in the input sentence, in the order they appear
//      * PARAMETER: String str
//      * RETURN VALUE: String
    
// */
//     public String getSecretMessage(String str) {
        
//        String [] msg_Splt = str.split("\\s",0);
//        String secret = "";
//        for(int i =0;i<msg_Splt.length;i++)
//        {
//             if(msg_Splt[i].length()==0)
//                 continue;
//             else
//             secret+= msg_Splt[i].charAt(0);
//        }
//        return(secret);

//     }
// }