// /*     * Assignment #11.1
//         * DUE: 05/22/20
//         * PURPOSE: Takes in a vector and prevents overflow
//         * Benjamin Gomez
//         * Section 4107
// */

import java.util.Vector;

public class HomeworkAssignment11_2 {
   public static void main(String args[]) {
      Solution sol = new Solution();
      Vector v = new Vector();
      v.add(9);
      v.add(9); 
      System.out.println(sol.plusPlusN(v)); // [1,0,0]
   }
}
// YOUR DOCUMENTATION STYLING HERE
class Solution {
   //OR, YOUR DOCUMENTATION STYLING HERE
   Vector plusPlusN(Vector v) {
      System.out.println(v.size());
      
      return v;

}
}