
// /**
//   * Assignment #5.1
//   * DUE: 04/3/20
//   * PURPOSE: to determine which version number is greater
//   * Benjamin Gomez
//   * Section 4107
//   */

// public class HomeworkAssignment5_1 {
//     public static void main(String[] args) {
//        Solution sol = new Solution();
//        System.out.println(sol.compareVersions("1","1.0")==0);
//        System.out.println(sol.compareVersions("1", "2.0")==-1);
//        System.out.println(sol.compareVersions("2.0", "1.0")==1);
//        System.out.println(sol.compareVersions("01.02.03", "1.2.3")==0);
       
//     }
//  }
//  class Solution {
 /*       *
          * FUNCTION SIGNATURE: public int compareVersions(String ver1, String ver2)
          * PURPOSE: returns integer based on which of 2 versions is larger
          * @param String ver1, String ver2
          * @return int
          *
*/  
//     public int compareVersions(String ver1, String ver2)
//     {
//         // if versions are only 1 character long, just compare them
//         if(ver1.length() ==1 && ver2.length()==1)
//         {
//             if(ver1.charAt(0) > ver2.charAt(0))
//             {
//                 return 1;
//             }
//             else if(ver1.charAt(0) < ver2.charAt(0))
//             {
//                 return -1;
//             }
//             else
//             {
//                 return 0;
//             }
//         }

//         //If len > 1 split string to individual strings and compare value of each in the array. 
//         String [] spltRslt_1 = ver1.split("[.]",-2);
//         String [] spltRslt_2 = ver2.split("[.]",-2);
//         int shortestLen = spltRslt_1.length < spltRslt_2.length ? spltRslt_1.length : spltRslt_2.length;
        
//        int i =0;
//        int j = 0;
//        int k = 0;
//         while(i< shortestLen){
//             // in order to ignore 0s check if value is a 0 and if so just move the index one forward. 
//             Integer v_1 = Integer.valueOf(spltRslt_1[j]);
//             if( v_1 == 0)
//             {
//                 v_1 =  Integer.valueOf(spltRslt_2[j+1]);
//                 j++;
//             }

//             Integer v_2 = Integer.valueOf(spltRslt_2[k]);
//             if( v_2 == 0)
//             {
//                 v_2 =  Integer.valueOf(spltRslt_2[k+1]);
//                 k++;
//             }
            
//             if(v_1<v_2)
//             {
//                 return -1;
//             }
//             else if(v_1>v_2)
//             {
//                 return 1;
//             }
//             else if(v_1==v_2)
//             {
//                 return 0;
//             }
//             i++;
//             j++;
//             k++;

//         }
//        return 0;
//     }
//  }