// /*     * Assignment #11.2
//         * DUE: 05/22/20
//         * PURPOSE: takes in the vector representation of N and returns the result of ++N
//         * Benjamin Gomez
//         * Section 4107
// */

import java.util.Vector;

public class HomeworkAssignment11_2 {
   public static void main(String args[]) {
      Solution sol = new Solution();
      Vector<Integer> v = new Vector<Integer>();
      v.add(8);
      v.add(9); 
      System.out.println(sol.plusPlusN(v)); // [1,0,0]
   }
}
/*       *
          * FUNCTION SIGNATURE:  Vector plusPlusN(Vector v)
          * PURPOSE: takes in the vector representation of N and returns the result of ++N
          * @param Vector v
          * @return Vector 
          *
 */
class Solution {
  
   Vector plusPlusN(Vector v) {
      v.add(0,1);
      v.add(0,0);
      boolean flag = false;
      for(int i = v.size()-1;i>=0;i--)
      {
         if(v.get(i).equals(9))
         {
            v.set(i,0);
            flag = true;
            v.set((i-1),v.get(i-1)+1);
            System.out.println(v.get(i));
         }
        System.out.println( v.get(i));
      }
      // System.out.println(v.get(i));
      return v;

}
}